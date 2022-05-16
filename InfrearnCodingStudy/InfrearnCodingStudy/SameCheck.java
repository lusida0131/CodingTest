package InfrearnCodingStudy;

import java.util.Arrays;
import java.util.Scanner;

public class SameCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		String answer = "U";
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			if(arr[i] == arr[i + 1]) {
				answer = "D";
				break;
			}
		}
		System.out.println(answer);
	}
}
