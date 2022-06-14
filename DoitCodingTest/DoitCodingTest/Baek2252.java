package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2252 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		int insert[] = new int[n + 1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			list.get(s).add(e);
			insert[e]++;
		}
		Queue<Integer> que = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			if(insert[i] == 0) {
				que.offer(i);
			}
		}
		while(!que.isEmpty()) {
			int now = que.poll();
			System.out.println(now );
			for(int next : list.get(now)) {
				insert[next]--;
				if(insert[next] == 0) {
					que.offer(next);
				}
			}
		}
	}
}
