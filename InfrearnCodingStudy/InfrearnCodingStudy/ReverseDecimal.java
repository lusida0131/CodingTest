package InfrearnCodingStudy;
import java.util.Scanner;

public class ReverseDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String answer = "ok";
		st = st.toUpperCase();
		int len = st.length();
		for(int i = 0; i < len/2; i++) {
			if(st.charAt(i) != st.charAt(len - i- 1)) {
				answer = "NO";
			} else {
				System.out.println(answer);
			}
		}
	}

}
