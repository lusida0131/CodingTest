package Day4;

import java.util.Scanner;

public class BoardSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int answer = Integer.MIN_VALUE;
		int sum = 0,sum2 = 0;
		for(int i = 0; i < n; i++) {
			sum = sum2 = 0;
			for(int j = 0; j < n; j++) {
				sum += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum);
			answer = Math.max(answer, sum2);
		}
		sum = sum2 = 0;
		for(int i = 0; i < n; i++) {
			sum = arr[i][i];
			sum2 = arr[i][n-i-1];
		}
		answer = Math.max(answer, sum);
		answer = Math.max(answer, sum2);
		System.out.println(answer);
	}

}
