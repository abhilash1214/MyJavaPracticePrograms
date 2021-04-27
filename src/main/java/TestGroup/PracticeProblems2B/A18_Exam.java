package TestGroup.PracticeProblems2B;

public class A18_Exam {

	public static void main(String[] args) {
		// String S = "abccbd";
		// int[] C = { 0, 1, 2, 3, 4, 5 };

		// String S = "aabbcc";
		// int[] C = { 1, 2, 1, 2, 1, 2 };

		String Sa = "aaaa";
		int[] C = { 3, 4, 5, 6 };
		
		char[] S = Sa.toCharArray();
		int sum = 0;
		for (int i = 0; i < S.length - 1; i++) {
			if (S[i] == S[i + 1]) {
				sum = C[i] + sum;
			}
		}
		System.out.println(sum);
	}

}
