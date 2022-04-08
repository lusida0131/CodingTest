package Day7;

import java.util.Scanner;
import java.util.Stack;

public class BracketRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : st.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			} else {
				stack.push(x);
			}
		}
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		System.out.println(answer);
	}	
}
