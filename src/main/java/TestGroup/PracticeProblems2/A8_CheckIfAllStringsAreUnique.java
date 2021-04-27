package TestGroup.PracticeProblems2;

import java.util.HashSet;

//Using Set
public class A8_CheckIfAllStringsAreUnique {

	public static void main(String[] args) {
		String x = "aradhya brillinace center";
		HashSet<Character> hset = new HashSet<Character>();
		for (int i = 0; i < x.length(); i++) {
			if (hset.contains(x.charAt(i)) == false) {
				hset.add(x.charAt(i));
			} else {
				// System.out.println("Contains Duplicate");
			}
		}
		// System.out.println(hset);

		A8_CheckIfAllStringsAreUnique aa = new A8_CheckIfAllStringsAreUnique("this is javapoint");
	}

	// for A9_ReverseEachWord validation
	A8_CheckIfAllStringsAreUnique(String x) {

		String[] xSplit = x.split(" ");

		for (int i = 0; i < xSplit.length; i++) {
			char[] xSplitStringToChar = xSplit[i].toCharArray();
			char[] revVal = new char[xSplit[i].length()];

			for (int j = 0; j < xSplit[i].length(); j++) {
				revVal[xSplit[i].length() - 1 - j] = xSplitStringToChar[j];
			}
			System.out.print(revVal);
			System.out.print(" ");
		}

	}
}
