package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2178 {
	static int arr[][];
	static boolean visited[][];
	static int []dx = {1, 0, -1, 0};
	static int []dy = {0, 1, 0, -1};
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}
		BFS(0,0);
		System.out.println(arr[n - 1][m - 1]);
	}

	private static void BFS(int i, int j) {
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[]{i, j});
		visited[i][j] = true;
		while(!que.isEmpty()) {
			int now[] = que.poll();
			
			for(int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x >= 0 && x < n && y >= 0 && y < m) {
					if(arr[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true;
						arr[x][y] = arr[now[0]][now[1]] + 1;
						que.add(new int[] {x,y});
					}
				}
			}
		}
	}
}
