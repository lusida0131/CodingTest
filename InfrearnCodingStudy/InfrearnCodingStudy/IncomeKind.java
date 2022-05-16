package InfrearnCodingStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IncomeKind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int lt = 0;
		ArrayList answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
		for(int i = 0; i < m - 1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		for(int rt = m - 1; rt < n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt]) - 1);
			if(HM.get(arr[lt]) == 0) {
				HM.remove(arr[lt]);
			}
			lt++;
		}
		System.out.println(answer);
	}
}
