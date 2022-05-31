package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int []arr = new int[n]; 
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			int target = Integer.parseInt(st.nextToken());
			boolean result = false;
			int start = 0;
			int end = arr.length - 1;
			while(start <= end) {
				int mid = (start + end) / 2;
				int midV = arr[mid];
				if(midV > target) {
					end = mid - 1;
				}
				else if(midV < target) {
					start = mid + 1;
				}
				else {
					result = true;
					break;
				}
			}
			if(result) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
}
