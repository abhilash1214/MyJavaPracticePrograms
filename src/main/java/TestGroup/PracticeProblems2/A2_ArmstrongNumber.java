package TestGroup.PracticeProblems2;

//153=1*1*1+5*5*5+3*3*3
public class A2_ArmstrongNumber {

	private void Armstrongvalidation(int no) {
		String noString = String.valueOf(no);
		int sum = 0;
		for (int i = 0; i < noString.length(); i++) {
			int mult = 1;
			for (int j = 0; j < noString.length(); j++) {
				mult = Character.getNumericValue(noString.charAt(i)) * mult;
			}
			sum = mult + sum;
		}
		System.out.println(sum);
		if (sum == no) {
			System.out.println("No is Armstrong");
		} else {
			System.out.println("NOT Armstrong");
		}
	}

	public static void main(String[] args) {
		A2_ArmstrongNumber a = new A2_ArmstrongNumber();
		a.Armstrongvalidation(153);
	}
}
