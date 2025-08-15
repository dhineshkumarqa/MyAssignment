package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 };

		List<Integer> List1 = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			List1.add(a[i]);
		}

		Collections.sort(List1);

		System.out.println(List1);

		for (int i = List1.size() - 1; i >= 0; i--) {
			if (List1.get(i) < List1.get(List1.size() - 1)) {
				System.out.println(List1.get(i));
				break;
			}
		}

	}

}
