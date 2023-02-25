package j2kb_8th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sosu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [end + 1];
		
		for(int i = 1; i <= end; i++) {
			arr[i] = i;
		}
		for(int i = 2; i <= Math.sqrt(end); i++) {
			if(arr[i] == 0) {
				continue;
			}
			
			for(int j = i + i; j <= end; j = j + i) {
				arr[j] = 0;
			}
		}
		for(int i = start; i <= end; i++) {
			if(arr[i] != 0 && i != 1) {
				System.out.println(arr[i]);
			}
		}
	}
	
}
