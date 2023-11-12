package self;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Random random = new Random();

			System.out.println("Enter the number of array elements:");
			int size = sc.nextInt();
			int[] array = new int[size];

			System.out.println("Enter the array elements:\n");
			for (int i = 0; i < size; i++) {
				array[i] = random.nextInt(100);
			}
			System.out.println("The array pre sorting is: ");
			printArray(array);

			bubbleSort(array);
			System.out.println("\nThe array post sorting is: ");

			printArray(array);

		}
	}

	private static void bubbleSort(int[] array) {
		int size = array.length;
		bubbleSort(array, size);
	}

	private static void bubbleSort(int[] array, int size) {
		if (size <= 1) {
			return;
		}
		int temp;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
