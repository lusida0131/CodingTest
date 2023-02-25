package j2kb_8th;

import java.util.Scanner;

public class Sol11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[1001];
		int mod = 10007;
		arr[1] = 1;
		arr[2] = 3;
		for(int i = 3; i <= n; i++) {
			
			arr[i] = (arr[i - 1] + (arr[i - 2] * 2)) % mod;
		}
		System.out.println(arr[n]);
	}
}
