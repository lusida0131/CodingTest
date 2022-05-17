package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2167 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [][] arr = new int [n + 1][m + 1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int k = Integer.parseInt(br.readLine());
		int sum;
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j = x1; j <= x2; j++) {
				for(int t = y1; t <= y2; t++) {
					sum += arr[j][t];
				}
			}
			System.out.println(sum);
		}	
	}

}
