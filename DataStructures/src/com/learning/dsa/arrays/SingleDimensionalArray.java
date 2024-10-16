package com.learning.dsa.arrays;

public class SingleDimensionalArray {

	private int[] array;

	public SingleDimensionalArray(int size) {
		array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = Integer.MIN_VALUE;
		}
	}

	public void insert(int location, int value) {

		try {
			if (array[location] == Integer.MIN_VALUE) {
				array[location] = value;
			} else {
				System.out.println(String.format("This location %d is already occuplied.", location));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(String.format("This location %d is invalid.", location));
		}

	}

	public void get(int location) {

		try {
			int result = array[location];
			System.out.println(String.format("Value at this location %d is %d.", location, result));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(String.format("This location %d is invalid.", location));
		}

	}

	public void traversal() {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Traversal is done.");
	}

	public void search(int value) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				System.out.println(String.format("Given value %d is found at the location %d.", value, i));
				return;
			}
		}

		System.out.println(String.format("Given value %d is not found.", value));
	}

	public void delete(int location) {

		try {

			array[location] = Integer.MIN_VALUE;
			System.out.println(String.format("Value at given location %d is deleted successfully.", location));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(String.format("Given location %d is not found.", location));
		}
	}
}
