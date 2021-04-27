package TestGroup.PracticeProblems2;

public class A9_ReverseEachWord extends A8_CheckIfAllStringsAreUnique {

	A9_ReverseEachWord(String x) {
		super(x);
		System.out.println("IN CONSTRUCTOR");
	}

	public static void main(String[] args) {
		String x = "this is javapoint";
		String[] xSplit = x.split(" ");

		for (int i = 0; i < xSplit.length; i++) {
			String eachWord = xSplit[i];

			char[] xx = eachWord.toCharArray();
			char[] a = new char[xx.length];
			for (int j = 0; j < eachWord.length(); j++) {
				a[xx.length - j - 1] = xx[j];
			}

			//System.out.print(a);
			//System.out.print(" ");

		}
		
		
		A9_ReverseEachWord aa= new A9_ReverseEachWord("this is javapoint");
	}

}
