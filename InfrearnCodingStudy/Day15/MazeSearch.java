package Day15;
import java.io.*;
import java.util.*;
public class MazeSearch {
	static int [][] arr;
	static int answer = 0;
	int [] dx = {0,1,0,-1};
	int [] dy = {1,0,-1,0};
	public void DFS(int x , int y) {
		if(x == 7 && y == 7) {
			answer++;
		}
		else {
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && arr[nx][ny] == 0) {
					arr[nx][ny] = 1;
					DFS(nx, ny);
					arr[nx][ny] = 0;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		MazeSearch T = new MazeSearch();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 8;
		arr = new int[n][n];
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n; j++) {			
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		arr[1][1] = 1;
		T.DFS(1, 1);
		System.out.println(answer);
	}
}