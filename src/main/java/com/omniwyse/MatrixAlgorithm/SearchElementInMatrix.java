package com.omniwyse.MatrixAlgorithm;

public class SearchElementInMatrix {
	static boolean searchElement(int[][] array, int searchNumber) {
		int i = 0;
		int row = array.length, column = array[0].length;
		if (searchNumber < array[0][0] || searchNumber > array[row - 1][column - 1]) {
			return false;
		}

		// int row1 = 0, column1 = array.length;

		while (i < row && column-1 >= 0) {
			if (array[i][column - 1] == searchNumber) {
				return true;
			}
			if (array[i][column - 1] < searchNumber) {
				i++;
			} else {
				column--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1,  2,  3,   4 }, 
	   			   		{ 11, 12, 13, 14 }, 
	   			   		{ 21, 24, 26, 28 },
	   			   		{ 31, 32, 33, 34 }  };
		System.out.println(searchElement(arr, 26));
	}

}
