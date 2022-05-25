package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] cnt = new int [10001];
		
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuffer bf = new StringBuffer();
		
		for(int i = 0; i < n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		for(int i = 1; i < 10001; i++) {
			while(cnt[i] > 0) {
				bf.append(i + "\n");
				cnt[i]--;
			}
			
		}
		System.out.println(bf.toString());
	}
}
