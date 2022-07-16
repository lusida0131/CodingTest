package DoitCodingTest;

import java.util.*;
import java.io.*;

public class Baek10816 {
	static int[] arr;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int find = Integer.parseInt(st.nextToken());
			bw.append((right(find) - left(find)) + " ");
		}
		bw.flush();
		bw.close();
	}

	private static int left(int find) {
		int start = 0;
		int end = n;
		while(start < end) {
			int mid = (start + end) / 2;
			if(find <= arr[mid]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}

	private static int right(int find) {
		int start = 0;
		int end = n;
		while(start < end) {
			int mid = (start + end) / 2;
			if(find >= arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return start;
	}
}
