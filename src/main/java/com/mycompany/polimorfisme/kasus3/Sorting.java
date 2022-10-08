package com.mycompany.polimorfisme.kasus3;

/*
 * Sorting.java  Author: Lewis/Loftus
 * 
 * Demonstrates the selection sort and insertion sort algorithm.
 */

public class Sorting {
	/*
	 * Sort the specified array of objects using the selection
	 * sort algorithm.
	 */
	public static void selectionSort(Comparable[] list) {
		int min;
		Comparable temp;

		for (int index = 0; index < list.length; index++) {
			min = index;
			for (int scan = index + 1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) < 0) {
					min = scan;
				}
			
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}

	/*
	 * Sorts the specified array of objects using the insertion sort algorithm.
	 */
	public static void insertionSort(Comparable[] list) {
		for (int index = 1; index < list.length; index++) {
			Comparable key = list[index];
			int position = index;

			// Shift larger value values to the right (ascending)
			// while (position > 0 && key.compareTo(list[position  - 1]) < 0) {
			// 	list[position] = list[position - 1];
			// 	position--;
			// }

			// descending
			while (position > 0 && key.compareTo(list[position - 1]) > 0) {
				list[position] = list[position - 1];
				position--;
			}

			list[position] = key;
		}
	}
}
