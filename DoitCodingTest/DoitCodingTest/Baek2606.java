package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2606 {
	static ArrayList<Integer> arr[];
	static boolean visited[];
	static int cnt, v;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		
		for(int i = 1; i <=n; i++) {     // 인덱스 편의상 n+1설정, 0번째 요소는 사용 X  
			arr[i] = new ArrayList<>();
		}
		v = 1; // 탐색 시장할 정점의 번호
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			arr[e].add(v);
			arr[v].add(e);
			
		}
		System.out.println(DFS(v));
	}

	private static int DFS(int i) {
		visited[i] = true;
		for(int b : arr[i]) {
			if(visited[b] == false) {
				cnt++;
				DFS(b);
			}
		}
		return cnt;
	}

}
