package week3.day1;

public class OddIndex {

	public static void main(String[] args) {

		String test = "changeme";

		char[] newstring = test.toCharArray();

		for (int i = 0; i < newstring.length; i++) {

			if (i % 2 != 0) {
				System.out.print(Character.toUpperCase(newstring[i]));
			} else {
				System.out.print(newstring[i]);
			}

		}

	}

}
