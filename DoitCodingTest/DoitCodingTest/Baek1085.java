package DoitCodingTest;
import java.util.*;
import java.io.*;

public class Baek1085 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int endX = w - x;
		int endY = h - y;
		
		int m = Math.min(x, y);
		int n = Math.min(endX, endY);
		
		int answer = Math.min(m, n);
		System.out.println(answer);
		br.close();
	}
	
}
