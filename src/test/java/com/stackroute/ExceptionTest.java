package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class ExceptionTest
{
    /**
     * Rigorous Test :-)
     */
    private static exceptionCheck exchk;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        exchk=new exceptionCheck();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        exchk = null;

    }

    @Test(expected = NullPointerException.class)
    public void testNullPointer(){
        exchk.printNull();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexBound(){
        exchk.printBound();
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testNegateArray(){
        exchk.printNegatArray();
    }

}