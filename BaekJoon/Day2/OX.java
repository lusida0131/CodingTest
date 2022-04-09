package Day2;
import java.io.*;
import java.util.*;
public class OX {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] arr = new String [n];
		int [] answer = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;					
				}
				else {
					cnt = 0;
				}
				answer[i] += cnt;
			}
			cnt = 0;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(answer[i]);
		}
	}
}
