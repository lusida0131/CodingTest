package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek1916 {
	static int n, m;
	static ArrayList<Node>[] list;
	static boolean[] visit;
	static int[] distance;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n + 1];
		visit = new boolean[n + 1];
		distance = new int[n + 1];
		
		for(int i = 0; i <= n; i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for(int i = 0; i <= n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list[s].add(new Node(e, v));
		}
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		dijkstra(start, end);
		
		System.out.println(distance[end]);
		
	}
	private static int dijkstra(int start, int end) {
		PriorityQueue<Node> que = new PriorityQueue<>();
		que.offer(new Node(start, 0));
		distance[start] = 0;
		while(!que.isEmpty()) {
			Node cur = que.poll();
			int c_v = cur.vertex;
			if(!visit[c_v]) {
				visit[c_v] = true;
				for(Node n : list[c_v]) {
					if(!visit[n.vertex] && distance[n.vertex] > distance[c_v] + n.value) {
						distance[n.vertex] = distance[c_v] + n.value;
						que.add(new Node(n.vertex, distance[n.vertex]));
					}
				}	
			}
		}
		return distance[end];
	}

}
class Node implements Comparable<Node>{
	int vertex;
	int value;
	public Node(int vertex, int value) {
		this.vertex = vertex;
		this.value = value;
	}
	@Override
	public int compareTo(Node o) {
		return value - o.value;
	}
}