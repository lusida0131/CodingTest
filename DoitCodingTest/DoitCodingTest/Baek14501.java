package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek14501 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] max = new int[n + 2];
		int[] day = new int[n + 1];
		int[] size = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			day[i] = Integer.parseInt(st.nextToken());
			size[i] = Integer.parseInt(st.nextToken());
			
		}
		for(int i = n; i > 0; i--) {
			if(i + day[i] > n + 1) {
				max[i] = max[i + 1];
			}
			else {
				max[i] = Math.max(max[i + 1], size[i] + max[i + day[i]]);
			}
		}
		System.out.println(max[1]);
	}
}
