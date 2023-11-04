package self;

import java.util.Scanner;

public class CharacterReversal {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			System.out.println("The input string is: " + input);
			String[] words = input.split("\s");
			int lenOfStringArray = words.length - 1;
			String reversedString = "";
			for (int i = lenOfStringArray; i >= 0; i--) {
				String reversedWord = "";
				int lenOfWord = words[i].length() - 1;
				for (int j = lenOfWord; j >= 0; j--) {
					reversedWord = reversedWord + words[i].charAt(j);
				}
				System.out.println("The reversed word is: " + reversedWord);
				reversedString = reversedString + reversedWord + " ";
			}
			System.out.println("The reversed string along with reversed words is:" + reversedString);

		}
	}
}
