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
			for(int j = 0; j < e; j++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				list[start].add(end);
				list[end].add(start);
			}
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
				check[i] = (check[node] + 1) % 2;
				DFS(i);
			}
			else if(check[node] == check[i]){
				IsEven = false;
			}
		}
	}
}
