package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek17626 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		dp[1] = 1;
		int min = 0;
		// 점화식 dp[i] = min(dp[i - j * j]) + 1
		for(int i = 2; i <= n; i++) {
			min = Integer.MAX_VALUE;
			for(int j = 1; j * j <= i; j++) {
				int tmp = i - j * j;
				min = Math.min(min, dp[tmp]);
			}
			dp[i] = min + 1;
		}
		System.out.println(dp[n]);
	}
}
