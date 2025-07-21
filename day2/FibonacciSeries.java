package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		System.out.print(first + "," + second);
		for (int i = 2; i < 7; i++) {
			int next = first + second;
			System.out.print("," + next);
			first = second;
			second = next;
		}

	}

}
