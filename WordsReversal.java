package self;

import java.util.Scanner;
public class WordsReversal {
public static void main(String [] args) {
	try(Scanner sc = new Scanner(System.in)){
		System.out.println("Please enter the string: ");
		String inputString = sc.nextLine();
		System.out.println("The input string is: "+inputString);
		//creating a String array to store each word of inputString
		String [] words = inputString.split(" ");
		System.out.println("The strings in the array are: ");
		for(String i: words) {
			System.out.println(i);
		}
		int len = (words.length) - 1;
		
		String reversed = " ";
		for(int i = 0; i <= len ; i++) {
			if(i == len) {
				reversed = words[i] + reversed;
			}
			else {
				reversed = " " + words[i] + reversed;
			}
		}
		System.out.println("The reversed String is: "+reversed);		
		
	}
}
}
