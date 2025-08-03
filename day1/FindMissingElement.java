package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int input[] = { 1, 4, 3, 2, 8, 6, 7 };

		// sorting the Array
		Arrays.sort(input);

		// loop through the array from 0 to length of array
		for (int i = 0; i < input.length; i++) {
			if (input[i] != i + 1) {
				System.out.println("The missing Number is : " + (i + 1));
				return;
			}
		}
	}

}
