package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek1947 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long mod = 1000000000;
		long[] arr = new long[1000001];
		arr[1] = 0;
		arr[2] = 1;
		for(int i = 3; i <= n; i++) {
			arr[i] = (i - 1) * (arr[i - 2] + arr[i - 1]) % mod;
		}
		System.out.println(arr[n]);
	}
}
