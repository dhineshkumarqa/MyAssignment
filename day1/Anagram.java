package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String Text1 = "stops";
		String Text2 = "potss";

		// check the length of the String using if condition

		if (Text1.length() == Text2.length()) {
			System.out.println("The Lenght of the Two is Matching");
		} else {
			System.out.println("The Length of this Two String Doestn't match");
			return;
		}

		// convert Both into a Character array
		char[] string1 = Text1.toCharArray();
		char[] string2 = Text2.toCharArray();

		// Sorting the both Array
		Arrays.sort(string1);
		Arrays.sort(string2);
        
		//Check if the sorted arrays are equal
		if (Arrays.equals(string1, string2)) {
			System.out.println("The given Strings are anagram");
		} else {
			System.out.println("The given String are not anagram");
		}

	}

}
