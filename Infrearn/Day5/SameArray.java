package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SameArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] b = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		int p1 = 0, p2 = 0;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Arrays.sort(a);
		Arrays.sort(b);
		while(p1 < n && p2 < m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			} else if(a[p1] > b[p2]) {
				p2++;
			} else 
				p1++;
		}
		System.out.println(answer);
	}

}
