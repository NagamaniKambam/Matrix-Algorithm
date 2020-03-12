package com.omniwyse.MatrixAlgorithm;

/**
 * Hello world!
 *
 */
public class App 
{
	static boolean searchElement(int[][] array, int searchNumber) {
	    int i1 = 0, j1 = 0;
			if (array[i1][j1] > searchNumber || array[array.length - 1][array.length] < searchNumber) {
				return false;
			}

			int i = 0, j = array.length;

			while (i < array.length && j >= 0) {
				if (array[i][j] == searchNumber) {
					return true;
				} else if (array[i][j] > searchNumber) {
					j--;
				} else
					i++;
			}
			return false;
	}
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println(searchElement(arr, 13));

	}

}
