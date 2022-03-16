package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int [] tmp = arr.clone();
		Arrays.sort(tmp);
		for(int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) {
				answer.add(i + 1);
			}
		}
		System.out.println(answer);
	}
}
