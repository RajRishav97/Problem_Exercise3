package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class fileDemoTest
{
    /**
     * Rigorous Test :-)
     */
    private static fileDemo fdemo;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fdemo=new fileDemo();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fdemo = null;

    }

    @Test
    public void readFileTest()
    {
        assertEquals("This is Code for read a file","Hello World.",fdemo.readFile("Hello_world.txt")
        );
        assertEquals("This is Code for read a file","Hello Java.",fdemo.readFile("Hello_Java.txt")
        );
        assertEquals("This is Code for read a file","Hello Programme.",fdemo.readFile("Hello_Program.txt")
        );
    }

    @Test
    public void readFileTestFailure()
    {
        assertNotNull("This is Code for read a file",fdemo.readFile("Hello_world.txt")
        );
        assertNotNull("This is Code for read a file",fdemo.readFile("Hello_Java.txt")
        );
        assertNotNull("This is Code for read a file",fdemo.readFile("Hello_Program.txt")
        );
    }



}