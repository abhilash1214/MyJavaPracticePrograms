package TestGroup.PracticeProblems2C;

public class A21_Patter1 {

	public static void main(String[] args) {
		/*
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
*/
		
		
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
