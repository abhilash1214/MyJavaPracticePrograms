package TestGroup.PracticeProblems2B;

import java.util.ArrayList;

//[10, 1, 10, 1, 11]
//max val is:11
public class A16_TwoDigitFragment {

	public static void main(String[] args) {
		String x = "101011";
		int max = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < x.length() - 1; i++) {
			int newVal = Integer.parseInt(x.substring(i, i + 2));
			list.add(newVal);
		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) > list.get(j)) {
					max = list.get(i);
				} else {
					max = list.get(j);
				}
			}
		}
		System.out.println("max val is:" + max);

	}

}
