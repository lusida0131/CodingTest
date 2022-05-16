package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class MazeShortSearch {
	static int n;
	static int [][] board,dis;
	static int [] dx = {0,1,0,-1};
	static int [] dy = {1,0,-1,0};
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		board[x][y] = 1;
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		MazeShortSearch T = new MazeShortSearch();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = 8;
		board = new int[n][n];
		dis = new int[n][n];
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		T.BFS(1, 1);
		if(dis[7][7] == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(dis[7][7]);
		}
	}
}
