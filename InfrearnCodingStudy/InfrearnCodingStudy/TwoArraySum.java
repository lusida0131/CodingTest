package InfrearnCodingStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] b = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m) {
			if(a[p1] > b[p2]) {
				answer.add(b[p2++]);
			}else {
				answer.add(a[p1++]);
			}
		}
		while(p1 < n) {
			answer.add(a[p1++]);
		}
		while(p2 < m) {
			answer.add(b[p2++]);
		}
		System.out.println(answer);
	}

}
