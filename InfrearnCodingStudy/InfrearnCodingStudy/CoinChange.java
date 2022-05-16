package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
public class CoinChange {
	static int n, m, answer = Integer.MAX_VALUE;
	static int [] arr;
	public void DFS(int L, int sum, int [] arr) {
		if(sum > m) {
			return;
		}
		if(L >= answer) {
			return;
		}
		if(sum == m) {
			answer = Math.min(answer, L);
		}
		else {
			for(int i = 0; i < n; i++) {
				DFS(L + 1, sum + arr[i], arr);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		CoinChange T = new CoinChange();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		for(int i = 0; i< n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		m = Integer.parseInt(br.readLine());
		T.DFS(0, 0, arr);
	}
}
