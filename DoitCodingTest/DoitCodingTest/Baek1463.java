package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int[] arr = new int[n + 1];
		arr[1] = 0;
	
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + 1;
			if(i % 2 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 2] + 1);
			}
			if(i % 3 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 3] + 1);
			}
		}
		System.out.println(arr[n]);
	}
}
