package Day19;
import java.io.*;
public class StoneBridge {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n + 2];
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3; i <= n + 1; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		System.out.println(arr[n + 1]);
	}
}
