package j2kb_8th;

import java.util.Scanner;

public class Sol11501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int n = sc.nextInt();
			
			int [] stock = new int[n + 1];
			
			long gain = 0;
			int max = 0;
			
			for(int j = 0; j < n; j++) {
				stock[j] = sc.nextInt();
			}
			for(int j = n - 1; j > -1; j--) { // 뒤에서 부터 비교 
				if(stock[j] > max) { // 현재 가격이 비쌀때 보다 크다면 
					max = stock[j];
				}
				else {
					gain += (max - stock[j]); // 아니면 팔았을 때 이득을 더 해준다.
				}
			}
			System.out.println(gain);
		}
	}
}
