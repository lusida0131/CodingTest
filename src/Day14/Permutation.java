package Day14;
import java.util.*;
import java.io.*;
public class Permutation {
	static int [] arr, ch, pm;
	static int n, m;
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L + 1);
					ch[i] = 0;
				}
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		Permutation T = new Permutation();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		for(int i = 0; i< n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
		//br.close();
	}
}
