package TestGroup.PracticeProblems2;

public class A5_IdentifyDuplicateElementUsingArray {
//Identify duplicate elements in a string by using array concept

	public static void main(String[] args) {
		String element = "abzcdaezc";
		String[] eleArray = new String[element.length()];

		for (int i = 0; i < eleArray.length; i++) {
			eleArray[i] = String.valueOf(element.charAt(i));
		}

		for (int i = 0; i < eleArray.length; i++) {
			for (int j = i + 1; j < eleArray.length; j++) {
				if (eleArray[i].equals(eleArray[j])) {
					System.out.println("Duplicate: " + eleArray[j]);
					break;
				}
			}
		}
	}
}
