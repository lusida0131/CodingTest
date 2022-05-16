package InfrearnCodingStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class CharReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] str = new String[n];
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		System.out.println(answer);
	}

}
