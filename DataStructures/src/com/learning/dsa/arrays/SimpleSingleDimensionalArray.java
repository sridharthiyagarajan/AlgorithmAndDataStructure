package com.learning.dsa.arrays;

import java.util.Arrays;

public class SimpleSingleDimensionalArray {

	public static void main(String[] args) {

		int[] sampleIntegerArray;
		sampleIntegerArray = new int[2];

		sampleIntegerArray[0] = 0;
		sampleIntegerArray[1] = 1;

		System.out.println(Arrays.toString(sampleIntegerArray));

		int[] sampleIntegerArray2 = { 2, 3 };

		System.out.println(Arrays.toString(sampleIntegerArray2));

	}

}