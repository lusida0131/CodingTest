package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek11659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] arr = new int[n + 1];
		int [] sum = new int[n + 1];
		int arrSum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n + 1; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//			arrSum += arr[i];
//			sum[i] = arrSum;

			sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			System.out.println(sum[l] - sum[k - 1]);
		}
	}
}
//5 4 3 2 1
//5 9 12 14 15
//1 2 3 4 5
//0 1 2 3 4