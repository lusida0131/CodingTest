package BaekJoon;
import java.io.*;
import java.util.*;
public class ASCII {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		char c = num.charAt(0);
		if(Character.isAlphabetic(c)) {
			int a = (int) c;
			System.out.println(a);
		}
		else {
			int a = (int) c;
			System.out.println(a);
		}
	}
}
