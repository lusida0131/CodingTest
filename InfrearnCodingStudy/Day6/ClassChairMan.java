package Day6;

import java.util.HashMap;
import java.util.Scanner;

public class ClassChairMan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
