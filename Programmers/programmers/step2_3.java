package programmers;
import java.util.*;
public class step2_3 {
	static int answer;
	public static void main(String[] args) {
		int n = 2;
		answer = 0;
		DFS(0, 0, n);
		System.out.println(answer);
	}
	private static void DFS(int left, int right, int n) {
		if(left < right) {
			return;
		}
		if(left == n && right == n) {
			answer++;
			return;
		}
		if(left > n || right > n) {
			return;
		}
		DFS(left + 1, right, n);
		DFS(left, right + 1, n);
	}
}

//int n = 2;
// () () 
// (())
