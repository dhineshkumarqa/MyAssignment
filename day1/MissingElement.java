package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 10, 6, 8 };

		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}

		Collections.sort(list1);
		System.out.println(list1);
		for (int i = 0; i < list1.size() - 1; i++) {
			int current = list1.get(i);
			int next = list1.get(i + 1);

			if (next - current > 1) {
				for (int j = current + 1; j < next; j++) {
					System.out.println("Missing number: " + j);

				}

			}

		}
	}
}
