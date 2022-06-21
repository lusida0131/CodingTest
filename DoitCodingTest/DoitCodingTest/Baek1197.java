package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1197 {
	static PriorityQueue<pEdge> que;
	static int[] parent;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		que = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			que.add(new pEdge(a, b, c));
		}
		int useEdge = 0;
		int result = 0;
		while(useEdge < n - 1) {
			pEdge now = que.poll();
			if(find(now.a) != find(now.b)) {   // 같은 부모가 아니라면 연결해도 사이클이 생기지 않음 
				union(now.a, now.b);
				result = result + now.c;
				useEdge++;
			}
		}
		System.out.println(result);
	}
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) {
			parent[b] = a;
		}
	}
	private static int find(int a) {
		if(a == parent[a]) {
			return a;
		}
		else {
			return parent[a] = find(parent[a]);
		}
	}
}
class pEdge implements Comparable<pEdge>{
	int a;
	int b;
	int c;
	public pEdge(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public int compareTo(pEdge o) {
		return this.c - o.c;
	}
}