package programmers;

public class test2_2 {
	static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static int [][] arr;
    static int max_virus;
    static int columns;
    static int rows;
	public static void main(String[] args) {
		rows = 3;
		columns = 4;
		max_virus = 2;
		int[][] queries = {{3, 2}, {3, 2},{2, 2},{3,2},{1,4}, {3,2},{2,3},{3,1}};
		
		int[][] answer = {};
        arr = new int[rows + 1][columns + 1];
        for(int i = 0; i < queries.length; i++) {
        	DFS(queries[i][0], queries[i][1]);
        }	
        for(int i = 1; i <= rows; i++) {
        	for(int j = 1; j <= columns; j++) {
        		System.out.print(arr[i][j] + " ");
        	}
        	System.out.println();
        }
	}
	private static void DFS(int i, int j) {
		if(arr[i][j] == max_virus) {
			for(int k = 0; k < 4; k++) {
				int nx = i + dx[k];
				int ny = j + dy[k];
				if(nx >= 1 && nx <= rows && ny >= 1 && ny <= columns) {
					if(arr[nx][ny] == max_virus) {
						
					}
					else if(arr[nx][ny] > max_virus) {
						arr[nx][ny] = max_virus;
					}
					else {
						arr[nx][ny] = arr[nx][ny] + 1;
					}
				}
			}
		}
		else if(arr[i][j] > max_virus) {
			arr[i][j] = max_virus;
		}
		else {
			arr[i][j] = arr[i][j] + 1;
		}
	}
}
