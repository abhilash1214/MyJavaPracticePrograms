package TestGroup.PracticeProblems2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class A7_CharactersInAString {

	public static void main(String[] args) {
		String x = "aradhya brillinace center";

		// usingArray(x);
		usingMaps(x);
		// usingSet(x);
	}

	// Using Array Concept
	static void usingArray(String val) {
		boolean b = true;
		int count = 0;

		for (int i = 0; i < val.length(); i++) {
			b = true;
			for (int j = i + 1; j < val.length(); j++) {
				if (val.charAt(i) == val.charAt(j)) {
					b = false;
					break;
				}
			}
			if (b == true) {
				System.out.print(val.charAt(i));
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

	// Using Map Concept
	static void usingMaps(String val) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < val.length(); i++) {
			if (map.containsKey(val.charAt(i)) == false) {
				map.put(val.charAt(i), 1);
			} else {
				map.put(val.charAt(i), map.get(val.charAt(i)) + 1);
			}
		}
		System.out.println(map);
		System.out.println(map.size());

		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Entry<Character, Integer> hmap2 : hmap) {
			System.out.println(hmap2.getKey() + ": " + hmap2.getValue());
		}
	}

	// Using Set
	static void usingSet(String val) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < val.length(); i++) {
			set.add(val.charAt(i));
		}

		System.out.println(set);
		System.out.println(set.size());

	}

}
