package TestGroup.PracticeProblems2B;

public class A14_StringFunctionsB extends A14_StringFunctions {

	// String x = "Sachin Tendulkar";
	public void subString(String x) {
		String y = x.substring(7);
		String z = x.substring(0, 7);
		System.out.println(y);
		System.out.println(z);
	}

	//S X a X c X h X i X n X   X T X e X n X d X u X l X k X a X r X 
	public void addletter(String x, String y) {
		String output = "";
		for (int i = 0; i < x.length(); i++) {
			output = x.substring(i, i + 1).concat(y);
			System.out.print(output);
		}
	}

	public static void main(String[] args) {
		A14_StringFunctionsB a = new A14_StringFunctionsB();
		a.subString("Sachin Tendulkar");
		a.concat("Sachin Tendulkar");
		a.addletter("Sachin Tendulkar", " X ");
	}

}
