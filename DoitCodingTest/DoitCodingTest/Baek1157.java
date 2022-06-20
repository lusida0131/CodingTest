package DoitCodingTest;
import java.util.*;
import java.io.*;

public class Baek1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		int[] arr = new int[26];
		int max = -1;
		char ch = '?';
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 65]++;
			if(max < arr[str.charAt(i) - 65]) {
				max = arr[str.charAt(i) - 65];
				ch = str.charAt(i);
			}
			else if(max == arr[str.charAt(i) - 65]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
