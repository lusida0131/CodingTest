package Day19;
import java.util.*;
import java.io.*;
public class StairClimb {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int [n];
		arr[0] = 1;
		arr[1] = 2;
		for(int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		System.out.println(arr[n - 1]);
	}
}
