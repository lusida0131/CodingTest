package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
class Point {
	int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class IslandBFS {
	static int n, answer = 0;
	static int [][] board,dis;
	static int [] dx = {0, 1, 0, -1,1, -1, 1, -1};
	static int [] dy = {1, 0, -1, 0, 1, -1, -1, 1};
	static Queue<Point> Q = new LinkedList<>();
	public static void BFS(int x, int y, int [][] board) {
		Q.offer(new Point(x, y));
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i < 8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					Q.offer(new Point(nx, ny));
				}
			}
			
		}
	}
	public static void main(String[] args) throws IOException{
		IslandBFS T = new IslandBFS();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		board = new int [n][n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					BFS(i, j, board);
				}
			}
		}
		System.out.println(answer);
	}
}
