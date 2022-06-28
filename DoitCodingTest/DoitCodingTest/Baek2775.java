package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek2775 {
	static int k, n;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			arr = new int[15][15];
			for(int j = 1; j < 15; j++) {
				for(int r = 1; r < 15; r++) {
					arr[0][r] = r;
					arr[j][1] = 1;
					arr[j][r] = arr[j - 1][r] + arr[j][r - 1];
				}
			}
			System.out.println(arr[k][n]);
		}
	}
}