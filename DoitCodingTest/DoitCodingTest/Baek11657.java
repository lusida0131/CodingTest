package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek11657 {
	static int n, m;
	static long distance[];
	static Edge edges[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		edges = new Edge[m + 1];
		distance = new long[n + 1];
		for(int i = 0; i <= n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			edges[i] = new Edge(s, e, v);
		}
		distance[1] = 0;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < m; j++) {
				Edge edge = edges[j];
				if(distance[edge.s] != Integer.MAX_VALUE
						&& distance[edge.e] > distance[edge.s] + edge.v) {
					distance[edge.e] = distance[edge.s] + edge.v;
				}
			}
		}
		boolean mCycle = false;
		for(int i = 0; i < m; i++) {
			Edge edge = edges[i];
			if(distance[edge.s] != Integer.MAX_VALUE
					&& distance[edge.e] > distance[edge.s] + edge.v) {
				mCycle = true;
			}
		}
		if(!mCycle) {
			for(int i = 2; i <= n; i++) {
				if(distance[i] == Integer.MAX_VALUE) {
					System.out.println("-1");
				}
				else {
					System.out.println(distance[i]);
				}
			}
		}
		else {
			System.out.println("-1");
		}
	}
}
class Edge {
	int s;
	int e;
	int v;
	public Edge(int s, int e, int v) {
		this.s = s;
		this.e = e;
		this.v = v;
	}
}