package TestGroup.PracticeProblems2D;

import java.util.ArrayList;

public class A23_LowestNoInString {

	public static void main(String[] args) {
		String name = "123Hello345How678Are234You568";

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) > '0' && name.charAt(i) <= '9') {
				list.add(Character.getNumericValue(name.charAt(i)));
			}
		}

		System.out.println(list);
		int min = 0;

		
	}

}
