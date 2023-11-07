package self;

import java.util.Scanner;
import java.lang.Math;

public class lcs {

	//the recursive function would start checking and comparing the last character
	public static int LCS(String firstString, String secondString, int len1, int len2) {
		if (len1 == 0 || len2 == 0) {
			return 0;
		}
		//When the last character matches
		if (firstString.charAt(len1 - 1) == secondString.charAt(len2 - 1)) {
			return 1 + LCS(firstString, secondString, len1 - 1, len2 - 1);
		} else { //If the last character does not match
			return Math.max(LCS(firstString, secondString, len1 - 1, len2),
					LCS(firstString, secondString, len1, len2 - 1));
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first string: ");
			String firstString = sc.nextLine();
			System.out.println("Enter the second string: ");
			String secondString = sc.nextLine();

			int length1 = firstString.length();
			int length2 = secondString.length();

			System.out.println("First string = " + firstString + " and its length = " + length1);
			System.out.println("Second string = " + secondString + " and its length = " + length2);

			int longestCommonSubsequenceLength = LCS(firstString, secondString, length1, length2);

			System.out.println("The length of the longest common subsequence is = " + longestCommonSubsequenceLength);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
