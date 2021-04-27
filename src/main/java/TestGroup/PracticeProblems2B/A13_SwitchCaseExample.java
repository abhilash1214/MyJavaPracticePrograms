package TestGroup.PracticeProblems2B;

public class A13_SwitchCaseExample {

	public static void main(String[] args) {
		switchCaseExacple("Monda3y");
	}

	public static void switchCaseExacple(String day) {
		switch (day) {
		default:
			System.out.println("100");

		case "Monday":
			System.out.println("1");
		case "Tuesday":
			System.out.println("2");
			break;
		case "Wednesday":
			System.out.println("3");
			break;
		case "Thursday":
			System.out.println("4");
			break;
		

		}
	}

}
