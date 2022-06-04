package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek16956 {
	static int []dx = {1, 0, -1, 0};
	static int []dy = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][]arr = new char[n][m];
		boolean flag = true;
		
		for(int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for(int j = 0 ; j < m; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 'W') {
					for(int r = 0; r < 4; r++) {
						int nx = i + dx[r];
						int ny = j + dy[r];
						
						if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
							if(arr[nx][ny] == '.') {
								arr[nx][ny] = 'D';
							}
							else if(arr[nx][ny] ==  'S') {
								flag = false;
								System.out.println(0);
								return;
							}
						}
					}
				}
			}
		}
		if(!flag) {
			System.out.println(0);
		}
		else {
			StringBuilder sb = new StringBuilder();
			System.out.println(1);
			for(int i = 0 ; i < n; i++) {
				sb.append(arr[i]);
				sb.append("\n");
			}
			System.out.println(sb);
		}
	}
}
