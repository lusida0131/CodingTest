package DoitCodingTest;
import java.util.*;
public class Baek11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n + 1];
		arr[1] = 1;
		arr[2] = 2;
		int mod = 10007;
		for(int i = 3; i <= n; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % mod;
		}
		System.out.println(arr[n]);
	}
}
