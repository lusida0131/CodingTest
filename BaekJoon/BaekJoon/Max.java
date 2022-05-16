package BaekJoon;
import java.io.*;
import java.util.*;

public class Max {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 9;
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = Integer.MIN_VALUE;
		int index = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			cnt++;
			if(max < arr[i]) {
				max = arr[i];
				index = cnt;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
