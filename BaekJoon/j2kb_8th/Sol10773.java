package j2kb_8th;

import java.util.Scanner;
import java.util.Stack;

public class Sol10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			int add = sc.nextInt();
			if(add == 0) {
				stack.pop();
			}
			else {
				stack.add(add);
			}
		}
		int sum = 0;
		
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}

}
