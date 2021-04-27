package TestGroup.PracticeProblems2;

import java.util.ArrayList;

public class A8B_CheckIfAllStringsAreUnique {

	public static void main(String[] args) {
		String x = "aradhya brillinace center";
		x = x.replace(" ", "");
		char[] a = x.toCharArray();

		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		System.out.println(list);

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (list.get(i).equals(list.get(j))) {
					System.out.println("Duplicate: " + list.get(i));
					break;
				}
			}
		}
	}

}
