package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1325 {
	static int []answer;
	static ArrayList<Integer>[] list;
	static boolean []visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n + 1];
		visit = new boolean[n + 1];
		answer = new int [n + 1];
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			list[s].add(e);
		}
		for(int i = 1; i <= n; i++) {
			visit = new boolean[n + 1];
			BFS(i);
		}
		int max = 0;
		for(int i = 1; i <= n; i++) {
			max = Math.max(max, answer[i]);
		}
		for(int i = 1; i <= n; i++) {
			if(answer[i] == max) {
				System.out.print(i + " ");
			}
		}
 	}
	private static void BFS(int i) {
		Queue<Integer> que = new LinkedList<>();
		que.add(i);
		visit[i] = true;
		while(!que.isEmpty()) {
			int now = que.poll();
			for(int b : list[now]) {
				if(visit[b] == false) {
					visit[b] = true;
					answer[b]++;
					que.add(b);
				}
			}
 		}
	}
}
