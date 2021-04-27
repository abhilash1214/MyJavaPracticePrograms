package TestGroup.PracticeProblems2;

public class A4_ReverseANumber {

// Using StringBuffer and StringBuilder classes
	public void revUsingBufferBuilder() {
		int no = 12345;
		String noString = String.valueOf(no);

		StringBuilder sb = new StringBuilder(noString);
		System.out.println(sb.reverse());

		StringBuffer sb2 = new StringBuffer(noString);
		System.out.println(sb2.reverse());

	}

//Convert int to String and reverse
	public void revStringFunction() {
		int no = 123456;
		String noString = String.valueOf(no);
		char[] a = noString.toCharArray();
		char[] rev = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			rev[a.length - 1 - i] = a[i];
		}
		System.out.println(rev);
	}

// Reverse No using int return type
	public void revNumber() {
		int no = 1234567, rev = 0, val = 0;
		while (no != 0) {
			val = no % 10;
			rev = rev * 10 + val;
			no = no / 10;
		}
		System.out.print(rev);
		System.out.println();
	}

	public static void main(String[] args) {
		A4_ReverseANumber a = new A4_ReverseANumber();
		a.revNumber();
		a.revStringFunction();
		a.revUsingBufferBuilder();
	}

}
