package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek1389 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n + 1][n + 1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j) {
					arr[i][j] = 0;
				}
				else {
					arr[i][j] = 1000001;
				}
			}
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s][e] = 1;
			arr[e][s] = 1;
		}
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
		int sum = 0;
		int answer = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				sum += arr[i][j];
			}
			if(answer > sum) {
				answer = sum;
				index = i;
			}
			sum = 0;
		}
		System.out.println(index);
	}
}
