package j2kb_8th;

import java.util.Scanner;

public class Sol2947 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int []arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.split(" ");
		}
	}
}
