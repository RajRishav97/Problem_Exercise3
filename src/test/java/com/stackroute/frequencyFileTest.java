package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class frequencyFileTest
{
    /**
     * Rigorous Test :-)
     */
    private static freqencyFile freqdemo;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        freqdemo=new freqencyFile();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        freqdemo = null;

    }

    @Test
    public void readFileTest()
    {
        assertEquals("This is Code for read a file","sleep => 1\n" +
                "a => 2\n" +
                "null => 1\n" +
                "like => 1\n" +
                "have => 1\n" +
                "i => 3\n" +
                "man => 1\n" +
                "to => 1\n" +
                "am => 1\n" +
                ", => 2\n" +
                ". => 1\n" +
                "home => 1",freqdemo.readFreq("FileDemo.txt")
        );
    }

    @Test
    public void readFileTestFailure()
    {
        assertNotNull("This is Code for read a file",freqdemo.readFreq("Hello_world.txt")
        );
    }



}