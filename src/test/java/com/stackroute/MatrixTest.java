package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MatrixTest
{
    /**
     * Rigorous Test :-)
     */
    private static matrixAdd mtadd;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        mtadd=new matrixAdd();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        mtadd = null;

    }

    @Test
    public void testMatrixAdd()
    {
        assertEquals("This is code for Adding Matrix.",new int[][]{{10, 10},{ 10, 10}, {10, 10}},mtadd.AddMatrix(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}})
                );
        assertEquals("This is code for Adding Matrix.",new int[][]{{10, 10, 10},{ 10, 10, 10}, {10, 10, 10}},mtadd.AddMatrix(3,2,new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{9,8,7},{6,5,4},{3,2,1}})
        );
        assertEquals("This is code for Adding Matrix.",new int[][]{{25,25,25,25},{ 25,25,25,25}, {25,25,25,25}},mtadd.AddMatrix(3,4,new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}},new int[][]{{24,23,22,21},{20,19,18,17},{16,15,14,13}})
        );

    }

    @Test
    public void testMatrixAddFailure()
    {
        assertNotNull("This is code for Adding Matrix.",mtadd.AddMatrix(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}})
        );
        assertNotEquals("This is code for Adding Matrix.",new int[][]{{10, 10, 10},{ 10, 10, 10}, {10, 10, 20}},mtadd.AddMatrix(3,2,new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{9,8,7},{6,5,4},{3,2,1}})
        );
        assertNotEquals("This is code for Adding Matrix.",new int[][]{{35,25,25,25},{ 25,25,25,25}, {25,25,25,25}},mtadd.AddMatrix(3,4,new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}},new int[][]{{24,23,22,21},{20,19,18,17},{16,15,14,13}})
        );

    }




}