package TestGroup.PracticeProblems2;

//Prime numbers upto
public class A1b_PrimeOrNot {

	A1b_PrimeOrNot(int noUpto) {

		System.out.println("Below is the list of Prime Nos");
		for (int i = 1; i < noUpto; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}

			}
			if (flag == true) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		A1b_PrimeOrNot a = new A1b_PrimeOrNot(20);

	}
}
