package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1722 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr[] = new ArrayList[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		long f[] = new long[21];
		int[] s = new int[21];
		boolean visit[] = new boolean[21];
		f[0] = 1;
		for(int i = 1; i <= n; i++) {  // 팩토리얼 초기화 -> 각 자리수에서 만들 수 있는 경우의 수 
			f[i] = f[i - 1] * i;
		}
		
		if(m == 1) {
			long k = Long.parseLong(st.nextToken());
			for(int i = 1; i <= n; i++) {
				for(int j = 1, cnt = 1; j <= n; j++) {
					if(visit[j]) {
						continue;  // 이미 사용한 숫자는 사용할 수 없음 
					}
					if(k <= cnt * f[n - i]) { // 주어진 k에 따라 각 자리에 들어갈 수 있는 수 찾기 
						k -= ((cnt - 1) * f[n - i]);
						s[i] = j;
						visit[j] = true;
						break;
					}
					cnt++;
				}
			}
			for(int i = 1; i <= n; i++) {
				System.out.print(s[i] + " ");
			}
		}
		else {
			long k = 1;
			for(int i = 1; i <= n; i++) {
				s[i] = Integer.parseInt(st.nextToken());
				long cnt = 0;
				for(int j = 1; j < s[i]; j++) {
					if(visit[j] == false) {
						cnt++;   // 미사용 숫자 개수 만큼 카운트 
					}
				}
				k += cnt * f[n - i]; // 자릿수에 따라 순서 더하기 
				visit[s[i]] = true;
			}
			System.out.println(k);
		}
	}
}
