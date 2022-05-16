package DoitCodingTest;
import java.util.*;
import java.io.*;
public class Baek11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String sNum = br.readLine();
		char [] cNum = sNum.toCharArray();
		int [] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = cNum[i] - 48;
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
