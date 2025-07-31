package week2.day1;

public class PalindromeProblem {
	public static void main(String[] args) {
        
		int input = 121;
		int output = 0;
		int remainder;
		int Original = input;
		for (int i = input; i > 0; i = i / 10) {
			remainder = i % 10;
			output = (output * 10) + remainder;
		}

		if (Original == output) {
			System.out.println("Given " + Original + " is palindrome");
		} else {
			System.out.println("Giver " + Original + " is not a palindrome");

		}
	}
}
