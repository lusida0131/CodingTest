package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1516 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int[] indegree = new int[n + 1];
		int[] selfBuild = new int[n + 1];
		for(int i = 0; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			selfBuild[i] = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			while(true) {
				if(r == -1) {
					break;
				}
				list.get(r).add(i);
				indegree[i]++;
			}
		}
		Queue<Integer> que = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			if(indegree[i] == 0) {
				que.offer(i);
			}
		}
		int[] result = new int[n + 1];
		while(!que.isEmpty()) {
			int now = que.poll();
			for(int i : list.get(now)) {
				indegree[i]--;
				result[i] = Math.max(result[now], result[now] + selfBuild[now]);
				if(indegree[i] == 0) {
					que.offer(i);
				}
			}
		}
		for(int i = 1; i <= n; i++) {
			System.out.println(result[i] + selfBuild[i]);
		}
	}
}
