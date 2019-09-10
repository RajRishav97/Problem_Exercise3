package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class studentMarksTest
{
    /**
     * Rigorous Test :-)
     */
    private static StudentMarks students;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        students=new StudentMarks();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        students = null;

    }

    @Test
    public void testStudent()
    {
        //int[] array1=new int[]{86, 65, 98, 77};
        assertEquals(
                "It may give error due to your code..",
                "None of Students have unappropriate grade"
                        , students.getValue(4,new int[]{76, 55, 88, 67}));
        assertEquals(
                "It may give error due to your code..",
                "Student 1 has unappropriate grade", students.getValue(5,new int[]{108, 40, 88, 65, 75}));
        assertEquals(
                "It may give error due to your code..",
                "Student 2 and 4 has unappropriate grade", students.getValue(6, new int[]{99, 108, 40, 188, 65, 29}));


    }
    @Test
    public void testStudentFailure()
    {
        //int[] array1=new int[]{86, 65, 98, 77};
        assertNotEquals(
                "It may give error due to your code..",
                "The average is 82.50\n" +
                        "The minimum is 65\n" +
                        "The maximum is 65", students.getValue(4,new int[]{86, 65, 98, 77}));
        assertNotNull(
                "It may give error due to your code..",
                students.getValue(4,new int[]{76, 55, 88, 67}));
        assertNotNull(
                "It may give error due to your code..", students.getValue(4,new int[]{108, 40, 88, 95}));


    }



}
