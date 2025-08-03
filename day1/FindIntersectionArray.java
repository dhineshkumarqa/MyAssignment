package week3.day1;

public class FindIntersectionArray {

	public static void main(String[] args) {

		int Array1[] = { 3, 2, 11, 4, 6, 7 };
		int Array2[] = { 1, 2, 8, 4, 9, 7 };

		// Declare for loop iterator from 0 to array length
		for (int i = 0; i < Array1.length; i++) {
			// Declare a nested for another array from 0 to array length
			for (int j = 0; j < Array2.length; j++) {
				// Compare both the arrays using a conditional statement
				if (Array1[i] == Array2[j]) {
					// Print the first array
					System.out.println(Array1[i]);
				}
			}
		}
	}

}
