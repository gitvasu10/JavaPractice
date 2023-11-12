package dynamic_programming;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = new int[10];
		try {
			inputArray(array);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The array before sorting is: ");
		printArray(array);
		mergeSort(array);
		System.out.println("\n The array post sorting is: ");
		printArray(array);
	}

	public static void inputArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array elements: ");
		for (int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void mergeSort(int[] array) {
		int length = array.length;

		if (length < 2) {
			return;
		}
		int mid = length / 2;
		// Creating arrays for left child and right child arrays
		int[] leftChildArray = new int[mid];
		int[] rightChildArray = new int[length - mid];

		// Populating both the arrays with the parent array's values

		// Populating the left array
		for (int i = 0; i < mid; i++) {
			leftChildArray[i] = array[i];
		}

		// Populating the right child array
		for (int i = mid; i < length; i++) {
			// We can't start the right child from the index 0.
			// We have to start from mid upto length-1

			rightChildArray[i - mid] = array[i];
		}
		mergeSort(leftChildArray);
		mergeSort(rightChildArray);
		merge(array, leftChildArray, rightChildArray);

	}

	private static void merge(int[] array, int[] leftChildArray, int[] rightChildArray) {
		int leftLength = leftChildArray.length;
		int rightLength = rightChildArray.length;

		// iterators for the three arrays

		int i = 0, j = 0, k = 0;
		// looping till we run out of elements either from the left array or the right
		// array
		while (i < leftLength && j < rightLength) {
			if (leftChildArray[i] <= rightChildArray[j]) {
				array[k] = leftChildArray[i];
				i++;
			} else {
				array[k] = rightChildArray[j];
				j++;
			}
			k++;
		}

		// For odd size arrays, there'll be some elements which will be left unmatched.
		// So handling them too

		// if elements remain in the left half
		while (i < leftLength) {
			array[k] = leftChildArray[i];
			i++;
			k++;
		}
		while (j < rightLength) {
			array[k] = rightChildArray[j];
			j++;
			k++;
		}
	}
}
