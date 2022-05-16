package InfrearnCodingStudy;

import java.util.Scanner;

public class ContinueSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0, lt = 0, sum = 0;
		int [] arr = new int[n];
		int m = n / 2 + 1;
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		for(int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum == n) {
				answer++;
			}
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) {
					answer ++;
				}
			}
		}
		System.out.println(answer);
	}
}
