package com.learning.dsa.arrays;

public class TwoDimensionalArray {

	private int[][] array;

	public TwoDimensionalArray(int rowSize, int colSize) {

		array = new int[rowSize][colSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				array[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	public void insert(int row, int col, int value) {

		try {

			if (array[row][col] == Integer.MIN_VALUE) {
				array[row][col] = value;
				System.out.println(String.format("Given value %d is added at the given row %d, col %d successfully.",
						value, row, col));
			} else {
				System.out.println(
						String.format("Given row %d, col %d are already occupied with a valid value.", row, col));
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(String.format("Given row %d, col %d are invalid.", row, col));
		}
	}

	public void get(int row, int col) {
		try {
			int result = array[row][col];
			System.out.println(String.format("Value at given row %d, col %d is %d.", row, col, result));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(String.format("Given row %d, col %d are invalid.", row, col));
		}

	}

	public void traversal() {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j]);

			}
		}
		System.out.println("Traversal is done.");
	}

	public void search(int value) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				if (array[i][j] == value) {
					System.out.println(String.format("Value %d is found at given row %d, col %d.", value, i, j));
				}

			}
		}
	}

	public void delete(int row, int col) {
		try {
			array[row][col] = Integer.MIN_VALUE;
			System.out.println(String.format("Value at given row %d, col %d is deleted successfully.", row, col));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(String.format("Given row %d, col %d are invalid.", row, col));
		}

	}
}
