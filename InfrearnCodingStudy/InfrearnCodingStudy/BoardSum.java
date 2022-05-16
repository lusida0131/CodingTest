package InfrearnCodingStudy;
import java.util.Scanner;

public class BoardSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String answer = "";
		for(char x : st.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
				
			}
		}
		Integer.parseInt(answer);
		System.out.println(answer);
	}

}
