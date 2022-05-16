package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
public class IslandDFS {
	static int n, answer;
	static int [][] board;
	static int [] dx = {0, 1, 0, -1, 1, 1, -1, -1};
	static int [] dy = {1, 0, -1, 0, 1, -1, 1, -1};
	public static void DFS(int x, int y, int [][]board) {
		for(int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny < n && ny >= 0 && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		IslandDFS T = new IslandDFS();
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
					DFS(i, j, board);
				}
				
			}
		}
		System.out.println(answer);
		br.close();
	}
	
}

