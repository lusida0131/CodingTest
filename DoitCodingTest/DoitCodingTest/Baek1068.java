package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1068 {
	static ArrayList<Integer>[] arr;
	static boolean[] visit;
	static int r;
	static int answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n];
		visit = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		int root = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int s = Integer.parseInt(st.nextToken());
			if(s != -1) {
				arr[s].add(i);
				arr[i].add(s);
			}
			else {
				root = i;
			}
		}
		r = Integer.parseInt(br.readLine());
		if(r == root) {
			System.out.println(0);
		}
		else {
			DFS(root);
			System.out.println(answer);
		}
	}
	private static void DFS(int root) {
		visit[root] = true;
		int c = 0;
		for(int v : arr[root]) {
			if(!visit[v] && v != r) { // 삭제 노드가 아닐 떼도 탐색 중지 
				c++;
				DFS(v);
			}
		}
		if(c == 0) {
			answer++; // 자식 노드가 아닐 때 리프 노드로 간주하고 정답값 증가 
		}
	}
}
