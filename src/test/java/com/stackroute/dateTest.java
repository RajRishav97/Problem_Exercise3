package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class dateTest
{
    /**
     * Rigorous Test :-)
     */
    private static dateWeek dwk;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        dwk=new dateWeek();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        dwk = null;

    }
/*printDate takes 3 parameters date,month and year*/
    @Test
    public void testDate()
    {

        assertEquals("This is a Code for Printing first and last date of a week by date","Mon 26/08/2019\n" +
                "Sun 01/09/2019",dwk.printDate(30,8,2019));
        assertEquals("This is a Code for Printing first and last date of a week by date","Mon 13/08/2018\n" +
                "Sun 19/08/2018",dwk.printDate(15,8,2018));
        assertEquals("This is a Code for Printing first and last date of a week by date","Mon 09/09/2019\n" +
                "Sun 15/09/2019",dwk.printDate(10,9,2019));

    }

    @Test
    public void testDateFailure()
    {

        assertNotEquals("This is a Code for Printing first and last date of a week by date","Mon 30/08/2019\n" +
                "Sun 05/09/2019",dwk.printDate(30,8,2019));
        assertNotEquals("This is a Code for Printing first and last date of a week by date","Mon 15/08/2018\n" +
                "Sun 21/08/2018",dwk.printDate(15,8,2018));
        assertNotNull("This is a Code for Printing first and last date of a week by date",dwk.printDate(10,9,2019));

    }





}