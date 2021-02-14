package edu.bvks.sorts.merge;

import java.util.Arrays;

public class MergeSort {

	/**
	 * The MergeSort operations can be divided into 3 sub-tasks
	 * 
	 * 1. Split the Array in to half 
	 * 2. Sort the divided arrays 
	 * 3. Merge the sorted arrays
	 */

	public void sort(int[] array) {

		// Print the input
		System.out.println("Input Array >>> " + Arrays.toString(array));

		// The core logic for solving a recursive problem is to identify the base
		// condition, upon reaching should terminate recursion

		// Base condition declaration
		if (array.length < 2)
			return;

		// Identify the middle index of the array
		int middle = array.length / 2;

		// Create the left array
		int[] left = new int[middle];

		// Copy the elements to Left Array
		for (int i = 0; i < middle; i++) {
			left[i] = array[i];
		}

		// Print the left Array - for the purpose of checking
		// System.out.println(Arrays.toString(left));

		// Create the right array
		int[] right = new int[array.length - middle];

		// Copy the elements to Left Array
		for (int i = middle; i < array.length; i++) {
			right[i - middle] = array[i];
		}

		// Print the right Array - for the purpose of checking
		// System.out.println(Arrays.toString(right));

		// Sort the left Array using recursive call.
		sort(left);

		// Sort the right Array using recursive call.
		sort(right);

		// Merge the sorted arrays
		merge(left, right, array);

		System.out.println("Inter Merger <<< " + Arrays.toString(array));

	}

	public void merge(int[] left, int[] right, int[] array) {
		int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

		// Compare the individual elements of sorted arrays index wise and copy the
		// least value to the resultant array
		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] <= right[rightIndex]) {
				array[arrayIndex++] = left[leftIndex++];
			} else {
				array[arrayIndex++] = right[rightIndex++];
			}
		}

		// Copy the remaining elements after comparison from left to resultant array.
		while (leftIndex < left.length) {
			array[arrayIndex++] = left[leftIndex++];
		}

		// Copy the remaining elements after comparison from right to resultant array.
		while (rightIndex < right.length) {
			array[arrayIndex++] = right[rightIndex++];
		}

	}

}
