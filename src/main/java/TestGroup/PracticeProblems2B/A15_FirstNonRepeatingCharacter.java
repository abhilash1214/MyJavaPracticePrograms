package TestGroup.PracticeProblems2B;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class A15_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String x = "aazbcccdeffgghi";
		char[] a = x.toCharArray();

		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (lhm.containsKey(a[i]) == false) {
				lhm.put(a[i], 1);
			} else {
				lhm.put(a[i], lhm.get(a[i]) + 1);
			}
		}
		System.out.println(lhm);

		Set<Entry<Character, Integer>> lmap = lhm.entrySet();
		for (Entry<Character, Integer> lmap2 : lmap) {
			if (lmap2.getValue() == 1) {
				System.out.println("FIRST NON REPEATING:" + lmap2.getKey());
				break;
			}
		}

	}

}
