package TestGroup.PracticeProblems2B;

public class A11_CapitalLetterFirst {

	public static void main(String[] args) {
		String x = "this is javapoint";
		char[] a = x.toCharArray();

		a[0] = Character.toUpperCase(a[0]);

		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i + 1] = Character.toUpperCase(a[i + 1]);
				i++;
			}
		}
		System.out.print(a);
	}

}
