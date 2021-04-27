package TestGroup.PracticeProblems2B;

public class A19_Exam {
//Below is not correct, Need to find the question
	public static void main(String[] args) {
		int N = 268;
		String five="5";
		String NtoString = String.valueOf(N);
		int val=0;
		StringBuffer sb= new StringBuffer(NtoString);
		System.out.println(NtoString.substring(0));

		for (int i = 0; i < NtoString.length(); i++) {
			System.out.println(sb.insert(5, NtoString));
		}
	}

}
