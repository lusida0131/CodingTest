package InfrearnCodingStudy;

import java.util.Scanner;
import java.util.Stack;

public class RightBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String answer = "YES";
		Stack stack = new Stack<>();
		for(char x : st.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			} else {
				if(stack.isEmpty()) {
					answer = "NO";
				}
				stack.pop();
			}
		}
		if(!stack.isEmpty()) {
			answer = "NO";
		}
		System.out.println(answer);
	}
}
