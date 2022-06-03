package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int []arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int div = 0;
		int cnt = 0;
		int max = 0;
		for(int i = n - 1; i >= 0; i--) {
			if(k >= arr[i]) {
				div = arr[i];
				cnt += k / div;
				k = k % div;
			}
		
		}
		System.out.println(cnt);
	}
}
