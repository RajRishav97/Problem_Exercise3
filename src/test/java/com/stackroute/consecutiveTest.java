package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class consecutiveTest
{
    /**
     * Rigorous Test :-)
     */
    private static Consecutive cons;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        cons=new Consecutive();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        cons = null;

    }

    @Test
    public void testConsecutive()
    {
        assertEquals(
                "These are not Consecutive Numbers.",
                false, cons.checkCons("98,96,95,94,93"));
        assertTrue(
                "These are Consecutive Numbers.",cons.checkCons("54,53,52,51,50,49,48")
        );
        assertFalse("These are non Consecutive Numbers.",cons.checkCons("1,2,3,4,5,6,6"));
    }

    @Test
    public void testConsecutiveFailure()
    {
        assertNotEquals(
                "These are not Consecutive Numbers.",
                true, cons.checkCons("98,96,95,94,93"));
        assertNotNull(
                "These are Consecutive Numbers.",cons.checkCons("54,53,52,51,50,49,48")
        );
        assertTrue("These are Consecutive Numbers.",cons.checkCons("1,2,3,4,5,6"));
    }




}