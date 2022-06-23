package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1414 {
	static int n, sum;
	static PriorityQueue<lEdge> que;
	static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		que = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char[] tmpc = st.nextToken().toCharArray();
			for(int j = 0; j < n; j++) {
				int tmp = 0;
				if(tmpc[j] >= 'a' && tmpc[j] <= 'z') {
					tmp = tmpc[j] - 'a' + 1;
				}
				else if(tmpc[j] >= 'A' && tmpc[j] <= 'Z') {
					tmp = tmpc[j] - 'A' + 27;
				}
				sum = sum + tmp;
				if(i != j && tmp != 0) {
					que.add(new lEdge(i, j, tmp));
				}
			}
		}
		parent = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		int useEdge = 0;
		int result = 0;
		while(!que.isEmpty()) {
			lEdge now = que.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result = result + now.v;
				useEdge++;
			}
		}
		if(useEdge == n - 1) {
			System.out.println(sum - result);
		}
		else {
			System.out.println(-1);
		}
	}
	private static void union(int s, int e) {
		s = find(s);
		e = find(e);
		if(s != e) {
			parent[e] = s;
		}
	}
	private static int find(int s) {
		if(s == parent[s]) {
			return s;
		}
		else {
			return parent[s] = find(parent[s]);
		}
	}
}
class lEdge implements Comparable<lEdge> {
	int s;
	int e;
	int v;
	public lEdge(int s, int e, int v) {
		this.s = s;
		this.e = e;
		this.v = v;
	}
	@Override
	public int compareTo(lEdge o) {
		return this.v - o.v;
	}
	
}