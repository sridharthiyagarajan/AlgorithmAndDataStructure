package com.learning.dsa.arrays;

import java.util.Arrays;

public class SimpleTwoDimensionalArray {

	public static void main(String[] args) {

		int[][] sampleIntegerArray;
		sampleIntegerArray = new int[2][2];

		sampleIntegerArray[0][0] = 0;
		sampleIntegerArray[0][1] = 1;
		sampleIntegerArray[1][0] = 2;
		sampleIntegerArray[1][1] = 3;

		System.out.println(Arrays.deepToString(sampleIntegerArray));

		int[][] sampleIntegerArray2 = { { 3, 4 }, { 5, 6 } };

		System.out.println(Arrays.deepToString(sampleIntegerArray2));

	}

}