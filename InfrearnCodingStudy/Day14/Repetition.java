package Day14;
import java.util.*;
import java.io.*;
public class Repetition {
	static int [] arr;
	static int n, m;
	public void DFS(int L) {
		if(L == m) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) {
				arr[L] = i;
				DFS(L + 1);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		Repetition T = new Repetition();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		T.DFS(0);
		br.close();
	}
}
