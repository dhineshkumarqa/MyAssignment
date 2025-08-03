package week3.day1;

public class ReverseString {

	public static void main(String[] args) {

		String companyName = "TestLeaf";

		char[] charComapnyName = companyName.toCharArray();

		for (int i = charComapnyName.length - 1; i >= 0; i--) {
			System.out.print(charComapnyName[i]);
		}

	}

}
