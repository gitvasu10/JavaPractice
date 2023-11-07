package self;

import java.util.Scanner;
public class InsertionSort {
	public static void main(String [] args) {
		
		System.out.println("Please the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Please enter the elements: ");
		for(int i =0; i < size; i++) {
			array[i] = sc.nextInt();
			}
		System.out.println("The array is: ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");;
		}
		/*
		 * Since we need to compare the initial value with its succeeding value
		 * and then have to go inside the internal loop to iterate over all the 
		 * rest of the array elements to find their proper spot in the array. Therefore,
		 * we have initialized i to 1.*/
		
		for(int i = 1; i < size; i++) {
			int valueToBeCompared = array[i];
			
			int j = i-1;
			
			while(j >= 0 && array[j] > valueToBeCompared) {
				array[j+1] = array[j];
				j--;
			}
			/*
			 * During the final condition check, the value
			 * of j is -1 which will break the loop.
			 * Since j is declared outside the while loop, its value
			 * still remains unchanged i.e -1.
			 * Therefore, while placing the value of 'valueToBeCompared'
			 * in its right spot, we need to increase the value of j from -1 to 0.
			 * For this only, we did array[j+1]*/
			
			array[j+1] = valueToBeCompared;
		}
		System.out.println("\nThe sorted array is: ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
		}
			
		}
	}

