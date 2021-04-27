package TestGroup.PracticeProblems2;

public class A1_PrimeOrNot {
	public static void main(String[] args) {

		int no = 13;
		boolean flag = true;
		for (int i = 0; i < no; i++) {
			if (no % 2 == 0) {
				System.out.println("Not Prime");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("PRIME");
		}
	}
}
