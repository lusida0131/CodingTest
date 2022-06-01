package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int []arr = new int[n];
		int start = 0;
		int end = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(end < arr[i]) {
				end = arr[i];
			}
		}
		while(start < end) {
			long sum = 0;
			int mid = (start + end) / 2;
			for(int i = 0; i < n; i++) {
				if(arr[i] - mid > 0) {
					sum += arr[i] - mid;
				}
			}
			if(sum < m) {
				end = mid;
			}
			else{
				start = mid + 1;
			}
		}
		System.out.println(start - 1);
	}
}
