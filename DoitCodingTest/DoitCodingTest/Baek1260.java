package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1260 {
	static ArrayList<Integer> arr[];
	static boolean visited[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			arr[e].add(s);
			arr[s].add(e);
		}
		for(int i = 1; i <= n; i++) {
			Collections.sort(arr[i]);
		}
		visited = new boolean[n + 1];
		DFS(v);
		System.out.println();
		visited = new boolean[n + 1];
		BFS(v);
	}
	private static void BFS(int i) {
		Queue<Integer> que = new LinkedList<>();
		que.add(i);
		visited[i] = true;
		
		while(!que.isEmpty()) {
			int now = que.poll();
			System.out.print(now + " ");
			for(int b : arr[now]) {
				if(!visited[b]) {
					visited[b] = true;
					que.add(b);
				}
			}
		}
	}
	private static void DFS(int i) {
		System.out.print(i + " ");
		visited[i] = true;
		for(int b : arr[i]) {
			if(!visited[b]) {
				DFS(b);
			}
		}
	}
}
