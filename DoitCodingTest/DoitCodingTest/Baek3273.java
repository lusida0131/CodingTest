package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek3273 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int i = 0;
		int j = n - 1;
		int cnt = 0;
		Arrays.sort(arr);
		while(i < j) {
			if(arr[i] + arr[j] == m) {
				cnt++;
				i++;
				j--;
			}
			else if(arr[i] + arr[j] < m) {
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println(cnt);
	}

}
