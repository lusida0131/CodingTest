package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1167 {
	static boolean visited[];
	static int[] distance;
	static ArrayList<Edge> []arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			while(true) {
				int e = Integer.parseInt(st.nextToken());
				if(e == -1) {
					break;
				}
				int v = Integer.parseInt(st.nextToken());
				arr[s].add(new Edge(e, v));
			}
		}
		distance = new int[n + 1];
		visited = new boolean[n + 1];
		BFS(1);
		int max = 1;
		for(int i = 2; i <= n; i++) {
			if(distance[max] < distance[i]) {
				max = i;
			}
		}
		distance = new int[n + 1];
		visited = new boolean[n + 1];
		BFS(max);
		Arrays.sort(distance);
		System.out.println(distance[n]);
	}
	private static void BFS(int index) {
		Queue<Integer> que = new LinkedList<>();
		que.add(index);
		visited[index] = true;
		while(!que.isEmpty()) {
			int now = que.poll();
			for(Edge i : arr[now]) {
				int e = i.e;
				int v = i.value;
				if(!visited[e]) {
					visited[e] = true;
					que.add(e);
					distance[e] = distance[now] + v;
				}
			}
		}	
	}
}
class Edge {
	int e;
	int value;
	public Edge(int e, int value) {
		this.e = e;
		this.value = value;
	}
}