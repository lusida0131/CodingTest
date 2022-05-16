package InfrearnCodingStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class RootSerach {
	static int n, m, answer = 0;
	static int [][] graph;
	static int [] ch;
	public void DFS(int v) {
		if(v == n) {
			answer++;
		} else {
			for(int i = 1; i< n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		RootSerach T = new RootSerach();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m= Integer.parseInt(st.nextToken());
		graph = new int [n + 1][n + 1];
		ch = new int[n + 1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
