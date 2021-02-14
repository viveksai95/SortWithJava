package edu.bvks.sorts;

import java.util.Arrays;

import edu.bvks.sorts.merge.MergeSort;

public class Main {

	public static void main(String[] args) {
		// Driver code for performing the MergeSort functionality

		MergeSort merger = new MergeSort();
		// int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		merger.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
