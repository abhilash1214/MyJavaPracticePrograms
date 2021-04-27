package TestGroup.PracticeProblems2D;

import java.util.HashMap;
import java.util.TreeSet;

public class A24_StateStreet {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("StateStreet");
		StringBuffer sb2 = new StringBuffer("StateStreet");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);

		String s = "State Street"; // 1
		String s1 = new String("State Street");
		System.out.println(s.equals(s1));

		String name = "Statestreet123^&^&^*&";
		name = name.toUpperCase();
		char[] a = name.toCharArray();
		// char[] a= new char[name.length()];

		for (int i = 0; i < a.length; i++) {
			if (!(a[i] >= '0' && a[i] <= '9') && !(a[i] >= 'A' && a[i] <= 'Z')) {
				System.out.print(a[i]);
			}
		}
		System.out.println("*************");
		StringBuffer sb3 = new StringBuffer("StateStreet");
		StringBuffer sb4 = new StringBuffer("StateStreet");

		TreeSet set = new TreeSet<String>();
		set.add(sb3.toString());
		set.add(sb4.toString());

		System.out.println(set);

		String str1 = new String("sunil");
		String str2 = new String("sunil");
		HashMap hm = new HashMap();
		hm.put(str1, "hello");
		hm.put(str2, "bye");
		System.out.println(hm);

	}
}
