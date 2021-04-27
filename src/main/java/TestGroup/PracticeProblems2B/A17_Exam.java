package TestGroup.PracticeProblems2B;

import java.util.ArrayList;
import java.util.Collections;
//Max Val is: 71
//Max Val is: 17
public class A17_Exam {

	public static void main(String[] args) {
		int[] A = { 51, 71, 17, 42 };
		//int[] A = { 8, 9, 7, 2 };
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < A.length; i++) {
			int eachVal = A[i];
			String eachValString = String.valueOf(eachVal);
			int sum = 0;
			for (int j = 0; j < eachValString.length(); j++) {
				sum = sum + Character.getNumericValue(eachValString.charAt(j));
			}
			list.add(sum);
		}
		System.out.println(list);
		int max = Collections.max(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == max) {
				int index = i;
				System.out.println("Max Val is: " + A[i]);
			}
			
		}
	}

}
