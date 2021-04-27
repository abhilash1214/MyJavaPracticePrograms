package TestGroup.PracticeProblems2D;

public class A22_VowelsPosition {
	// vowels, posting

	public static void main(String[] args) {
		String name = "Abilash";
		name=name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				System.out.println("Vowel: " + name.charAt(i) + " at: " + i);
			}
		}

	}

}
