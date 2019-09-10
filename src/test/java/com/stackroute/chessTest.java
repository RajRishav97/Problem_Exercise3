package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class chessTest
{
    /**
     * Rigorous Test :-)
     */
    private static Chess chess;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        chess=new Chess();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        chess = null;

    }

    @Test
    public void testChess()
    {
        assertEquals(
                "This is a chess of Grid 8.",
                new String[][]{
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}
                        }, chess.printChess());
        assertEquals("This is a Chess of Grid-8",8,chess.checkRows());
        assertEquals("This is a Chess of Grid-8",8,chess.checkColumns());

    }

    @Test
    public void testChessFailure()
    {
        assertNotEquals(
                "This is a chess of Grid 8.",
                new String[][]{
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}
                }, chess.printChess());
        assertNotNull("This is a Chess of Grid-8",chess.checkRows());
        assertNotNull("This is a Chess of Grid-8",chess.checkColumns());

    }



}