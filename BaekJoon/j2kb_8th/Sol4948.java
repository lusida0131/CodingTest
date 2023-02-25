package j2kb_8th;

import java.util.Scanner;

public class Sol4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			int cnt = 0;
			boolean[] prime = new boolean[2 * n + 1];
			
			for(int i = 2; i <= Math.sqrt(2 * n); i++) {
				// 소수가 아닌것 
				if(prime[i]) {
					continue;
				}
				for(int j = i + i; j <= 2 * n; j = j + i) {
					prime[j] = true;
				}
			}
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
