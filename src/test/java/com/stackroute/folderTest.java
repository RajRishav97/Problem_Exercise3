package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Member;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class folderTest
{
    /**
     * Rigorous Test :-)
     */
    private static folderCheck fdemo;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fdemo=new folderCheck();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fdemo = null;

    }

    @Test
    public void readFolderTest()
    {
        assertEquals("This is Code for read a folder",new String[]{"FileName: hello.txt\n"+"Content: Hello World this is hello.txt.","FileName: text.txt\n"+"Content: This is Simple text."},fdemo.readFolder("Folder",".txt")
        );
        assertEquals("This is Code for read a folder",new String[]{"FileName: helloworld.java\n"+"Content: public class helloworld {\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        System.out.println(\"Hello World!\");\n" +
                "    }\n" +
                "}"},fdemo.readFolder("Folder",".java")
        );
        assertEquals("This is Code for read a file",new String[]{"FileName: helloworld.txt\n"+"Content: #include<stdio.h>\n" +
                "void main(){\n" +
                "    printf(\"Hello World\");\n" +
                "}"},fdemo.readFolder("Folder",".c")
        );
    }

    @Test
    public void readFileTestFailure()
    {
        assertNotNull("This is Code for read a file",fdemo.readFolder("Folder",".c")
        );
        assertNotNull("This is Code for read a file",fdemo.readFolder("Folder",".txt")
        );
        assertNotNull("This is Code for read a file",fdemo.readFolder("Folder",".java")
        );
    }



}