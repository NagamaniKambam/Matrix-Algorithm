package com.omniwyse.MatrixAlgorithm;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SearchMatrixElementTest {
	
	SearchElementInMatrix matrix = new SearchElementInMatrix();
	
	int arrayTest1[][] = { {  5, 10, 15, 20 },
						   { 25, 30, 35, 40 }, 
						   { 45, 50, 55, 60 } };
	
	// arrayTest1 test cases
	@Test
	public void arrayTest1_TopLeft() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 5) );
	}

	@Test
	public void arrayTest1_TopRight() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 20) );
	}

	@Test
	public void arrayTest1_BottomLeft() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 45) );
	}
	
	@Test
	public void arrayTest1_BottomRight() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 60) );
	}
	
	@Test
	public void arrayTest1_MiddleOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest1, 34) );
	}
	
	@Test
	public void arrayTest1_TopOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest1, -1) );
	}

	@Test
	public void arrayTest1_BottomOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest1, 80) );
	}
	
	@Test
	public void arrayTest1_TopRowMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 10) );
	}
	
	@Test
	public void arrayTest1_LastColumnMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 40) );
	}
	
	@Test
	public void arrayTest1_BottomRowMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 55) );
	}
	
	@Test
	public void arrayTest1_FirstColumnMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 25) );
	}
	
	@Test
	public void arrayTest1_ArrayMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest1, 30) );
	}
	
	
	//arrayTest2 test cases
	
	int arrayTest2[][] = { { 1,  2,  3,   4 }, 
			   			   { 11, 12, 13, 14 }, 
			   			   { 21, 24, 26, 28 },
			   			   { 31, 32, 33, 34 } };

	@Test
	public void arrayTest2_TopLeft() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 1) );
	}

	@Test
	public void arrayTest2_TopRight() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 4) );
	}

	@Test
	public void arrayTest2_BottomLeft() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 31) );
	}
	
	@Test
	public void arrayTest2_BottomRight() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 34) );
	}
	
	@Test
	public void arrayTest2_MiddleOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest2, 25) );
	}
	
	@Test
	public void arrayTest2_TopOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest2, -1) );
	}

	@Test
	public void arrayTest2_BottomOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest2, 40) );
	}
	
	@Test
	public void arrayTest2_TopRowMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 3) );
	}
	
	@Test
	public void arrayTest2_LastColumnMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 28) );
	}
	
	@Test
	public void arrayTest2_BottomRowMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 32) );
	}
	
	@Test
	public void arrayTest2_FirstColumnMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 11) );
	}
	
	@Test
	public void arrayTest2_ArrayMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest2, 26) );
	}
	
	
	//arrayTest3 test cases
	
	int arrayTest3[][] = { {11, 21, 31 }, 
						   {41, 51, 61 }, 
						   {71, 81, 91 }, 
						   {92, 95, 98 } };
	
	@Test
	public void arrayTest3_TopLeft() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 11) );
	}

	@Test
	public void arrayTest3_TopRight() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 31) );
	}

	@Test
	public void arrayTest3_BottomLeft() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 92) );
	}
	
	@Test
	public void arrayTest3_BottomRight() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 98) );
	}
	
	@Test
	public void arrayTest3_MiddleOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest3, 88) );
	}
	
	@Test
	public void arrayTest3_TopOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest3, -1) );
	}

	@Test
	public void arrayTest3_BottomOutOfBound() {
		Assert.assertEquals(false, matrix.searchElement(arrayTest3, 100) );
	}
	
	@Test
	public void arrayTest3_TopRowMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 21) );
	}
	
	@Test
	public void arrayTest3_LastColumnMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 91) );
	}
	
	@Test
	public void arrayTest3_BottomRowMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 95) );
	}
	
	@Test
	public void arrayTest3_FirstColumnMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 41) );
	}
	
	@Test
	public void arrayTest3_ArrayMiddle() {
		Assert.assertEquals(true, matrix.searchElement(arrayTest3, 81) );
	}
	

	


}
