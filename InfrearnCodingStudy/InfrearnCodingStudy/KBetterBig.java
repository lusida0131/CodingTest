package InfrearnCodingStudy;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KBetterBig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < n; i++) { 
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			if(cnt == m) {
				System.out.println(x);
			}
		}
	}
}
