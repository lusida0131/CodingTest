package InfrearnCodingStudy;

import java.util.Scanner;

public class TruncCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String answer = "";
		for (int i = 0; i < st.length(); i++) {
			if(st.indexOf(st.charAt(i)) == i) {
				answer += st.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
