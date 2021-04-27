package TestGroup.PracticeProblems2B;

import java.util.ArrayList;
import java.util.List;

public class A20_Exam {
	//Below is not correct, Need to find the question
	public static void main(String[] args) {
		int N[] = { 0, 0, 1, 1, 1, 1, 2, 2, 2, 1, 1, 3 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N.length; i++) {
			int count = 0;
			for (int j = i + 1; j < N.length; j++) {
				if (N[i] == N[j]) {
					count++;
					if (count <= 2) {
						list.add(N[i]);
					} else {
						break;
					}
				} else {
					list.add(N[i]);
				}

			}
		}
		System.out.println(list);
	}

}
