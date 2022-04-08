package Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GraphShort {
	static int n,m, answer = 0;
	static int [] ch,dis;
	static ArrayList<ArrayList<Integer>> graph;
	public void BFS(int v) {
		ch[v] = 1;
		dis[v] = 0;
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(v);
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}		
	}
	public static void main(String[] args) throws IOException{
		GraphShort T = new GraphShort();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int [n + 1];
		dis = new int [n + 1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
 	}
}
