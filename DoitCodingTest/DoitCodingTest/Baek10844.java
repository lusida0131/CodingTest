package DoitCodingTest;

import java.util.Scanner;

public class Baek10844 {

	public static void main(String[] args) {
		long mod = 1000000000;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] arr = new long[n + 1][11];
		for(int i = 1; i <= 9; i++) {
			arr[1][i] = 1;
		}
		for(int i = 2; i <= n; i++) {
			arr[i][0] = arr[i - 1][1];
			arr[i][9] = arr[i - 1][8];
			for(int j = 1; j <= 8; j++) {
				arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % mod;
			}
		}
		long sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = (sum + arr[n][i]) % mod;
		}
		System.out.println(sum);
	}

}
