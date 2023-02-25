package j2kb_8th;

import java.util.Scanner;
import java.util.Stack;

public class Sol9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(ch == '(') {
					stack.push(ch);
				}
				else {
					if(stack.isEmpty()) {
						stack.push(ch);
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			stack.clear();
		}

	}

}
