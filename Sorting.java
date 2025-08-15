package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		String[] array = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> List1 = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			List1.add(array[i]);
		}

		Collections.sort(List1);

		System.out.println(List1);

		for (int i = List1.size() - 1; i >= 0; i--) {
			System.out.print(List1.get(i));
			if (i != 0) 
			{
				System.out.print(",");
			}
		}

	}

}
