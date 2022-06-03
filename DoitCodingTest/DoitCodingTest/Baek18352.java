package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek18352 {
	static int [] visit;
	static ArrayList<Integer>[] list;
	static List<Integer> answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n + 1];
		visit = new int[n + 1];
		answer = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			list[s].add(e);
		}
		for(int i = 1; i <= n; i++) {
			visit[i] = -1;
		}
		BFS(x);
		for(int i = 1; i <= n; i++) {
			if(visit[i] == k) {
				answer.add(i);
			}
		}
		if(answer.isEmpty()) {
			System.out.println(-1);
		}
		else {
			Collections.sort(answer);
			for(int b : answer) {
				System.out.println(b);
			}
		}
	}
	private static void BFS(int x) {
		Queue<Integer> que = new LinkedList<>();
		que.add(x);
		visit[x]++;
		while(!que.isEmpty()) {
			int now = que.poll();
			for(int i : list[now]) {
				if(visit[i] == -1) {
					visit[i] = visit[now] + 1;
					que.add(i);
				}
				
			}
		}
		
	}
}

