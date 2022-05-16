package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
public class Combination {
	static int n, m;
	static int [] combi;
	public void DFS(int L, int s) {
		if(L == m) {
			for(int x : combi) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i = s; i <= n; i++) {
				combi[L] = i;
				DFS(L + 1, s + 1);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		Combination T = new Combination();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		combi = new int[m];
		T.DFS(0, 1);
	}
}
