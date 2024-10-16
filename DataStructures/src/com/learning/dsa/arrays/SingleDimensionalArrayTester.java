package com.learning.dsa.arrays;

public class SingleDimensionalArrayTester {

	public static void main(String[] args) {

		SingleDimensionalArray singleDimensionalArray = new SingleDimensionalArray(2);
		singleDimensionalArray.insert(0, 0);
		singleDimensionalArray.insert(1, 1);
		singleDimensionalArray.insert(2, 2);

		singleDimensionalArray.get(0);

		singleDimensionalArray.traversal();

		singleDimensionalArray.search(1);

		singleDimensionalArray.delete(0);
	}

}
