package com.omniwyse.MatrixAlgorithm;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	int arr[][] = { { 1, 2, 3, 4 }, 
    	        { 5, 6, 7, 8 }, 
    	        { 9, 10, 11, 12 } };
        assertEquals(true, SearchElementInMatrix.searchElement(arr, 1));
    }
}
