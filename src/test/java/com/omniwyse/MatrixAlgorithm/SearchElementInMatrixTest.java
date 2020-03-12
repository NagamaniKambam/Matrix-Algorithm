package com.omniwyse.MatrixAlgorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SearchElementInMatrixTest {

	int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

	@Test
	public void test() {

		assertEquals(true, SearchElementInMatrix.searchElement(arr, 1));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 2));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 3));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 4));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 5));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 6));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 7));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 8));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 9));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 10));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 11));
		assertEquals(true, SearchElementInMatrix.searchElement(arr, 12));

		assertEquals(true, arr[0][0] == 1);
		assertEquals(true, arr[0][1] == 2);
		assertEquals(true, arr[0][2] == 3);
		assertEquals(true, arr[0][3] == 4);
		assertEquals(true, arr[1][0] == 5);
		assertEquals(true, arr[1][1] == 6);
		assertEquals(true, arr[1][2] == 7);
		assertEquals(true, arr[1][3] == 8);
		assertEquals(true, arr[2][0] == 9);
		assertEquals(true, arr[2][1] == 10);
		assertEquals(true, arr[2][2] == 11);
		assertEquals(true, arr[2][3] == 12);

		int[] row1 = Arrays.copyOfRange(arr[0], 1, 3);
		System.out.println(row1);

		int[] row2 = Arrays.copyOfRange(arr[1], 1, 3);
		System.out.println(row2);
		
		int[] row3 = Arrays.copyOfRange(arr[2], 1, 3);
		System.out.println(row3);

		// assertEquals(true, Arrays.asList(arr[0]).contains(1) );

		// assertEquals(true, SearchElementInMatrix.searchElement(arr, 13));

	}

}
