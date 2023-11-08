package self;

import java.util.Scanner;

public class QuickSort {

	public static void quicksort(int[] array, int lowerIndex, int upperIndex) {

		// Creating the left pointer and the right pointer
		int leftpointer = lowerIndex;
		int rightpointer = upperIndex;

		// Exit condition: If the both the pointers cross each other, then exit
		if (leftpointer > rightpointer) {
			return;
		}

		// Taking the array's last element as the pivot element
		int pivot = array[upperIndex];

		while (leftpointer < rightpointer) {
			// Iterating till we find value greater than at the pivot element
			while (array[leftpointer] <= pivot && leftpointer < rightpointer) {
				leftpointer++;
			}
			// Iterating till we find a value less than at the pivot element
			while (array[rightpointer] >= pivot && leftpointer < rightpointer) {
				rightpointer--;
			}
			// When we come out of both the loops, we swap the values at both the pointers
			swap(array, leftpointer, rightpointer);
		}

		/*
		 * When internal swapping is done, swapping the pivot with the point where both
		 * the left and the right pointer coincide
		 */
		swap(array, leftpointer, upperIndex);

		// Calling the function again for the left subarray
		quicksort(array, lowerIndex, leftpointer - 1);

		// Calling the function again for the right subarray
		quicksort(array, leftpointer + 1, upperIndex);

	}

	public static void swap(int[] array, int lower, int higher) {
		int temp = array[higher];
		array[higher] = array[lower];
		array[lower] = temp;
	}

	public static void main(String[] args) {

		int[] array = new int[10];
		System.out.println("PLEASE ENTER THE ARRAY ELEMENTS:");
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 10; i++) {
				array[i] = sc.nextInt();
			}
			System.out.println("The pre-sorted array is: ");
			for (int i = 0; i < 10; i++) {
				System.out.println(array[i]);
			}

			quicksort(array, 0, array.length - 1);
			System.out.println("The post-sorted array is:");
			for (int i = 0; i < 10; i++) {
				System.out.println(array[i]);
			}

		}
	}
}
