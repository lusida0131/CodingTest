package DoitCodingTest;
import java.util.*;
import java.io.*;
public class Baek14706 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] arr = new int[n];
		
		// 조건 받는 부분 
		Map <Integer,Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		// 자리수 별 최
		
		
		for(int i = 1; i <= n; i++) {
			print(i);
		}
	}

	

}
