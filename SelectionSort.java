package self;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Enter the array size:");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int array[] = new int[size];
			System.out.println("Enter the array elements:\n");
			Random random = new Random();
			for (int i = 0; i < size; i++) {
				array[i] = random.nextInt(100);
			}
			System.out.println("The array pre sorting is: ");
			printArray(array);
			selectionSort(array);

			System.out.println("\nThe array post sorting is: ");
			printArray(array);

		}
	}

	private static void selectionSort(int[] array) {
		int size = array.length;
		for (int i = 0; i < size - 1; i++) {
			int min = array[i]; // Considering the first element as the minimum one
			for (int j = i + 1; j < size; j++) {
				int temp;
				if (array[j] < min) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

	}

	private static void printArray(int[] array) {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
