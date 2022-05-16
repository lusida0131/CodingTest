package BaekJoon;
import java.util.*;
import java.io.*;

public class Average {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		float [] arr = new float[n];
		float max = Integer.MIN_VALUE;
		float sum = 0;
		float answer = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i = 0; i < n; i++) {
			sum += arr[i] / max * 100;
		}
		answer =  sum / n;
		System.out.println(answer);
	}
}
