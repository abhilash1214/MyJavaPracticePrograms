package TestGroup.PracticeProblems2B;

import java.util.HashSet;

public class A12_RemoveDuplicates {

	public static void main(String[] args) {
		usingSet("aaabbcccdd");

	}

	// Using Collections
	public static void usingSet(String x) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < x.length(); i++) {
			set.add(x.charAt(i));
		}
		
		System.out.println(set);
		String output= set.toString();
		output=output.replace("[", "");
		output=output.replace("]", "");
		
		System.out.println(output);
	}

}
