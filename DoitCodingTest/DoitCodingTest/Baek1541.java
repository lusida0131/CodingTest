package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1541 {
	static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		String []str = st.split("-");
		
		for(int i = 0; i < str.length; i++) {
			int tmp = mySum(str[i]);
			if(i == 0) {
				answer = answer + tmp;
			}
			else {
				answer = answer - tmp;
			}
		}
		System.out.println(answer);
	}
	private static int mySum(String a) {
		int sum = 0;
		String temp[] = a.split("[+]");
		for(int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}
}
