package InfrearnCodingStudy;

import java.util.Scanner;

public class IntCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0, sum = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				cnt++;
				sum += cnt;
			}
			else {
				cnt = 0;
			}
		}
		System.out.println(sum);
	}

}
