package BaekJoon;
import java.util.*;
import java.io.*;

public class Remainder {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[10];
		int cnt = 0;
		int samecnt = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (Integer.parseInt(br.readLine()) % 42);
		}
		for(int i = 0; i < arr.length; i++) {
			samecnt = 0;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					samecnt++;
				}
			}
			if(samecnt == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
