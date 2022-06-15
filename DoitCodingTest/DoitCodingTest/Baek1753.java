package DoitCodingTest;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Baek1753 {
	static int n,m,k;
	static boolean[] visit;
	static int[] distance;
	static ArrayList<Edge>[] list;
	static PriorityQueue<Edge> que = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int k = Integer.parseInt(br.readLine());
		
		distance = new int[n + 1];
		list = new ArrayList[n + 1];
		visit = new boolean[n + 1];
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<Edge>();
		}
		for(int i = 1; i <= n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list[s].add(new Edge(e, v));
		}
		que.add(new Edge(k, 0));
		distance[k] = 0;
		while(!que.isEmpty()) {
			Edge current = que.poll();
			int c_v = current.vertex;
			if(visit[c_v]) {
				continue;
			}
			visit[c_v] = true;
			for(int i = 0; i < list[c_v].size(); i++) {
				Edge tmp = list[c_v].get(i);
				int next = tmp.vertex;
				int value = tmp.value;
				if(distance[next] > distance[c_v] + value) {
					distance[next] = value + distance[c_v];
					que.add(new Edge(next, distance[next]));
				}
			}
		}
		for(int i = 1; i <= m; i++) {
			if(visit[i]) {
				System.out.println(distance[i]);
			}
			else {
				System.out.println("INF");
			}
		}
	}
}
class Edge implements Comparable<Edge>{
	int vertex, value;
	Edge(int vertex, int value) {
		this.vertex = vertex;
		this.value = value;
	}
	@Override
	public int compareTo(Edge o) {
		if(this.value > o.value) {
			return 1;
		}
 		return -1;
	}
}
