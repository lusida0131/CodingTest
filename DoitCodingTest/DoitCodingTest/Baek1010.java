package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1010 {
	static long[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr = new long[31][31];
		for(int i = 0; i <= 30; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
			arr[i][1] = i;
		}
		for(int i = 2; i <= 30; i++) {
			for(int j = 1; j < i; j++) {  // 고르는 수 개수가 전체 개수를 넘을 수 없다 .
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]; // 조합 점화식 
			}
		}
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			System.out.println(arr[m][n]);
		}
	}
}

