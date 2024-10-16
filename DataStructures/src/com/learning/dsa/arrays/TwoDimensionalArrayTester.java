package com.learning.dsa.arrays;

public class TwoDimensionalArrayTester {

	public static void main(String[] args) {

		TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2, 2);

		twoDimensionalArray.insert(0, 0, 0);

		twoDimensionalArray.get(0, 0);
		
		twoDimensionalArray.traversal();
		
		twoDimensionalArray.search(0);
		
		twoDimensionalArray.delete(0, 0);

	}

}
