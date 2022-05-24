package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek11724 {
	static ArrayList<Integer> arr[];
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		for(int i = 1; i < n + 1; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			arr[e].add(v);
			arr[v].add(e);
		}
		int cnt = 0;
		for(int i = 1; i < n + 1; i++) {
			if(!visited[i]) {
				cnt++;
				DFS(i);
			}
		}
		System.out.println(cnt);
	}

	private static void DFS(int i) {
		if(visited[i]) {
			return;
		}
		visited[i] = true;
		for(int b : arr[i])
		if(visited[b] == false) {
			DFS(b);
		}
	}	
	
}
