package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class removeVowelsTest
{
    /**
     * Rigorous Test :-)
     */
    private static removeVowel rmv;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        rmv=new removeVowel();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        rmv = null;

    }

    @Test
    public void testRemoveVowels()
    {
        assertEquals(
                "This is code for remove small vowels",
                "Ind", rmv.remove("India"));
        assertEquals(
                "This is code for remove small vowels","Untd Stts", rmv.remove("United States"));
        assertEquals(
                "This is code for remove small vowels","Grmny", rmv.remove("Germany")
        );
        assertEquals(
                "This is code for remove small vowels","Egypt", rmv.remove("Egypt"));
        assertEquals(
                "This is code for remove small vowels","czchslvk", rmv.remove("czechoslovakia"));
    }


    @Test
    public void testRemoveVowelsFailure()
    {
        assertNotNull(
                "This is code for remove small vowels", rmv.remove("Iraq"));
        assertNotEquals(
                "This is code for remove small vowels","ntd Stts", rmv.remove("United States"));
        assertNotEquals(
                "This is code for remove small vowels","Grt Btn", rmv.remove("Great Britain")
        );
        assertNull(
                "This is code for remove small vowels", rmv.remove("aeiou"));
        assertNotEquals(
                "This is code for remove small vowels","czechslvk", rmv.remove("czechoslovakia"));
    }




}