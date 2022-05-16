package InfrearnCodingStudy;

import java.util.Scanner;

public class RankClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int [] answer = new int[n];
		for(int i = 0; i < n; i++) {
			int cnt = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					cnt++;
				}
			}
			answer[i] = cnt;
			System.out.print(answer[i] + " ");
		}
		
	}

}
