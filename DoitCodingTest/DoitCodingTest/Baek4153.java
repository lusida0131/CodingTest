package DoitCodingTest;
import java.util.*;
import java.io.*;

public class Baek4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		while(n != 0) {
			if((n*n + m*m) == h*h) {
				System.out.println("right");
			}
			else if((h*h + m*m) == n*n) {
				System.out.println("right");
			}
			else if((n*n + h*h) == m*m) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
		}
	}
}
