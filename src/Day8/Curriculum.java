package Day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : a.toCharArray()) {
			Q.offer(x);
		}
		for(char x : b.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) {
					answer = "NO";
				}
			}
		}
		if(!Q.isEmpty()) {
			answer = "NO";
		}
		System.out.println(answer);
	}
}
