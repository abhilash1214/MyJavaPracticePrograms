package TestGroup.PracticeProblems2;

public class A6_ContainsInteger {

	public static void main(String[] args) {
		String x = "aradhya brillinace center5 ";
		//x=x.trim();
		//x=x.replace(" ","");
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				System.out.println("Contains Integer: "+x.charAt(i));
			}

		}
	}

}
