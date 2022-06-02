package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek10815 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int look = Integer.parseInt(st.nextToken());
			int start = 0;
			int end = arr.length - 1;
			boolean result = false;
			while(start <= end) {
				int mid = (start + end) / 2;
				int midV = arr[mid];
				if(midV < look) {
					start = mid + 1;
				}
				else if(midV > look){
					end = mid - 1;
				}
				else {
					result = true;
					break;
				}
			}
			if(result) {
				System.out.print(1 + " ");
			}
			else {
				System.out.print(0 + " ");
			}
		}	
	}
}
