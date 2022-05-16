package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek10986 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long cnt = 0;
		long [] s = new long[n];
		long [] c = new long[m];
		st = new StringTokenizer(br.readLine());
		s[0] = Integer.parseInt(st.nextToken());
		for(int i = 1; i < n; i++) {	//수열의 합 배열 만들기 
			s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < n; i++) {	//합 배열의 모든 값에 % 연산 수행하기 
			int rem = (int)(s[i] % m);
			//0 ~ i 까지의 구간 합 자체가 0일 때 정답에 더하기  
			if(rem == 0) {
				cnt++;
			}
			// 나머지가 같은 인덱스의 개수 카운트 
			c[rem]++;
		}
		for(int i = 0; i < m; i++) {
			if(c[i] > 1) {
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하
				cnt = cnt + (c[i] * (c[i] - 1) / 2);
			}
		}
		System.out.println(cnt);
	}
}
