package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek13023 {
	static ArrayList<Integer> arr [];
	static boolean visited[];
	static boolean arrive;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arrive = false;
		
		arr = new ArrayList[n];
		visited = new boolean[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			arr[e].add(v);
			arr[v].add(e);
			
		}
		for(int i = 0; i < n; i++) {
			DFS(i, 1);
			if(arrive) {
				break;
			}
		}
		if(arrive) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

	private static void DFS(int now, int depth) {
		if(depth == 5 || arrive) {
			arrive = true;
			return;
		}
		visited[now] = true;
		for(int i : arr[now]) {
			if(!visited[i]) {
				DFS(i, depth + 1);
			}	
		}
		visited[now] = false;
	}
}
