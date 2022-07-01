package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek1256 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int [][] arr = new int[202][202];
		for(int i = 0; i <= 200; i++) {  // 조합 테이블 초기화 
			for(int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					if(arr[i][j] > 1000000000) { //k 범위가 넘어가면 범위의 최댓값 
						arr[i][j] = 1000000001;
					}
				}
			}
		}
		if(arr[n + m][m] < k) { // 주어진 자릿수로 만들 수 없는 K번째 수이면 
			System.out.println(-1);
		}
		else {
			// a를 선택했을 때 남은 문자로 만들 수 있는 모든 경우의 수가 K 보다 크면 
			while(!(n == 0 && m == 0)) {
				if(arr[n - 1 + m][m] >= k) {
					System.out.print("a");
					n--;
				}
				else { // 모든 경우의 수가 k보다 작으면 
					System.out.print("z");
					k = k - arr[n - 1 + m][m]; // k값 업데이트 
					m--;
				}
			}
		}
	}
}
