package TestGroup.PracticeProblems2C;

public class A21_Pattern3 {
	/*
	1
	2 2
	3 3 3
	4 4 4 4
	5 5 5 5 5
	6 6 6 6 6 6
	7 7 7 7 7 7 7
	 */

	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			for (int j = i; j >0; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
