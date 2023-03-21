package j2kb_8th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol1260 {
	static boolean[] visited;
	static ArrayList<Integer> list[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n + 1];
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
			list[y].add(x);
		}
		for(int i = 1; i <= n; i++) {
			Collections.sort(list[i]);
		}
		visited = new boolean[n + 1];
		DFS(start);
		System.out.println();
		visited = new boolean[n + 1];
		BFS(start);
	}
	private static void BFS(int i) {
		Queue<Integer> que = new LinkedList<>();
		que.add(i);
		visited[i] = true;
		while(!que.isEmpty()) {
			int now = que.poll();
			System.out.print(now + " ");
			for(int b : list[now]) {
				if(!visited[b]) {
					visited[b] = true;
					que.add(b);
				}
			}
		}
	}
	private static void DFS(int i) {
		visited[i] = true;
		System.out.print(i + " ");
		for(int b : list[i]) {
			if(visited[b] == false) {
				DFS(b);
			}
		}
	}
}
