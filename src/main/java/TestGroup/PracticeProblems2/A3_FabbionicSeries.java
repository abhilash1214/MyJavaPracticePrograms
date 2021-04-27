package TestGroup.PracticeProblems2;

public class A3_FabbionicSeries {
	// 0,1,1,2,3,5,8....... a=0,b=1,c=a+b
	public static void main(String[] args) {

	}

	static {
		int a = 0, b = 1, c = 0;
		System.out.print(a + "," + b);
		for (int i = 0; i < 35; i++) {
			c = a + b;
			a = b;
			b = c;
			if (c >= 60)
				break;
			System.out.print("," + c);
		}
	}
}
