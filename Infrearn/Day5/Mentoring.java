package Day5;

import java.util.Scanner;

public class Mentoring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int test = sc.nextInt();
		int [][] arr = new int [test][n];
		for(int i = 0; i < test; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int cnt = 0;
				for(int k = 0; k < test; k++) {
					int pi = 0;
					int pj = 0;
					for(int s = 0; s < n; s++) {
						if(arr[k][s] == i) {
							pi = s;
						}
						if(arr[k][s] == j) {
							pj = s;
						}
					}
					if(pi < pj) {
						cnt++;
					}
					if(cnt == test) {
						answer++;
					}
				
				}
			}
		}
		System.out.println(answer);
	}

}
