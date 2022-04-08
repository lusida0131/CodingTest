package Day8;

import java.util.Scanner;
import java.util.Stack;

public class SteelBar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int cnt = 0;
		Stack stack = new Stack<>();
		for(int i = 0; i < st.length(); i++) {
			if(st.charAt(i) == '(') {
				stack.push('(');
			}
			else {
				stack.pop();
				if(st.charAt(i - 1) == '(') {
					cnt += stack.size();
				}
				else cnt++;
			}
		}
		System.out.println(cnt);
	}
}
