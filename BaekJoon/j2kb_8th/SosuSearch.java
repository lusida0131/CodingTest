package j2kb_8th;

import java.util.Scanner;

public class SosuSearch {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		
		// Output
		for(int i = 0; i < n; i++) {
			boolean isPrime = false;
			if(arr[i] == 1) {
				continue;
			}
			for(int j = 2; j < arr[i]; j++) {
				if(arr[i] % j == 0) {
					isPrime = true;
					break;
				}
			}
			if(!isPrime) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
