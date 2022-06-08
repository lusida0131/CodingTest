package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1707 {
	static ArrayList<Integer> list[];
	static int[] check;
	static boolean visit[];
	static boolean IsEven;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			list = new ArrayList[v + 1];
			visit = new boolean[v + 1];
			check = new int[v + 1];
			IsEven = true;
			for(int j = 1; j <= v; j++) {
				list[j] = new ArrayList<>();
			}
			for(int j = 0; j < e; j++) {  // 인접 리스트로 그래프 저장하기 
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				list[start].add(end);
				list[end].add(start);
			}
			// 주어진 그래프가 1개로 연결돼 있다는 보장이 없으므로 모든 노드에서 수행하기 
			for(int j = 1; j <= v; j++) {
				if(IsEven) {
					DFS(j);
				}
				else {
					break;
				}
			}
			check[1] = 0;
			if(IsEven) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

	private static void DFS(int node) {
		visit[node] = true;
		for(int i : list[node]) {
			if(!visit[i]) {
				// 인접한 노드는 같은 집합이 아니므로 이전 노드와 다른 집합으로 처리하기 
				check[i] = (check[node] + 1) % 2;
				DFS(i);
			}
			// 이미 방문한 노드가 현재 내 노드와 같은 집합이면 이분 그래프가 아
			else if(check[node] == check[i]){
				IsEven = false;
			}
		}
	}
}
