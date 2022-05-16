package InfrearnCodingStudy;

import java.util.Scanner;

public class TemLeaderDay5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int answer = 0;
		int max = 0;
		for(int i = 1; i <= n; i++) {
			int cnt = 0;
			for(int j = 1; j <= n; j++) {
				for(int k = 1; k <= n; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
					if(cnt > max) {
						max = cnt;
						answer = i;
					}
				}
			}
		}
		System.out.println(answer);
	}
}

// 학년 학생 구함 -> 반 확인하는 인덱스 하나 