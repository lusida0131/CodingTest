package InfrearnCodingStudy;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(DFS(n));
	}
	public static int DFS(int n) {
		if(n == 1) {
			return 1; 
		}
		else {
			return n * DFS(n - 1);
		}
	}
}
