package InfrearnCodingStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrincessHelp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = 0;
		Queue<Integer> Q = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) {
			Q.offer(i);
		}
		while(!Q.isEmpty()) {
			for(int i = 1; i < k; i++) {
				Q.offer(Q.poll());
			}
			Q.poll();
			if(Q.size() == 1) {
				answer = Q.poll();
			}
		}
		System.out.println(answer);
	}
}
