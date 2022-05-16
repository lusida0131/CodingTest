package BaekJoon;
import java.util.*;
import java.io.*;

public class IntCnt {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pol = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int [] arr = new int[10];
		String str = String.valueOf(pol);
		for(int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
		for(int v : arr) {
			System.out.println(v);
		}
	}

}
