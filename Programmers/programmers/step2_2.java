package programmers;
import java.util.*;
public class step2_2 {
	static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int answer;
    static int[][] visit;
	public static void main(String[] args) {
		int [][]maps = {{1, 0, 1, 1, 1},
				{1, 0, 1, 0, 1},
				{1, 0, 1, 1, 1},
				{1, 1, 1, 0, 1,},
				{0, 0, 0, 0, 1}};
		answer = 0;
		int [][] visit = new int[maps.length][maps[0].length];
		visit[0][0] = 1;
		BFS(maps, visit);  
		answer = visit[maps.length - 1][maps[0].length - 1];
		if(answer == 0) {
			System.out.println(-1);
		}
		System.out.println(answer);
	}
	private static void BFS(int[][] maps, int[][] visit) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {0, 0});
		while(!que.isEmpty()) {
			int[] now = que.poll();
			int x = now[0];
			int y = now[1];
			for(int i = 0; i < 4; i++) {
				int nx = dx[i] + x;
				int ny = dy[i] + y;
				if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] == 1 && visit[nx][ny] == 0) {
					visit[nx][ny] = visit[x][y] + 1;
					que.add(new int[] {nx, ny});
				}
			}
		}
    }
}
