package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek11725 {
	static ArrayList<Integer>[] arr;
	static int[] answer;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n + 1];
		visit = new boolean[n + 1];
		answer = new int[n + 1];
		
		for(int i = 0; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		DFS(1);
		for(int i = 2; i <= n; i++) {
			System.out.println(answer[i]);
		}
	}
	private static void DFS(int i) {
		visit[i] = true;
		for(int k : arr[i]) {
			if(!visit[k]) {
				answer[k] = i;
				DFS(k);
			}
		}
	}
}
