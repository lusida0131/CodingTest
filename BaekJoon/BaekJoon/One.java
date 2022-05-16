package BaekJoon;
import java.io.*;
import java.util.*;
public class One {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long x = 1;
		while(true) {
			String st = br.readLine();
			if(st == null) {
				break;
			}
			int a = Integer.parseInt(st);
			int val = 0;
			for(int i = 1; i <= a; i++) {
				val = val * 10 + 1;
				val %= a;
				if(val == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
