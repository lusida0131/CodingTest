package Day1;

import java.util.Scanner;

public class StringAtLong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String [] ar = st.split(" ");
		String answer = "";
		int min = Integer.MIN_VALUE;
		for (String x : ar) {
			int len = x.length();
			if(min < len) {
				min = len;
				answer = x;
			}
		}
		System.out.println(answer);
	}

}
