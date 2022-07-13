package DoitCodingTest;
import java.util.*;
import java.io.*;

public class Baek1654 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		
		long[] arr = new long[k];
		for(int i = 0; i < k; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(arr);
		
		long start = 1;
		long end = arr[k - 1];
		long mid = 0;
		
		while(start <= end) {
			mid = (start + end) / 2;
			int sum = 0;
			for(int i = 0; i < k; i++) {
				sum += arr[i] / mid;
			}
			if(sum < n) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		System.out.println(end);
	}
}
