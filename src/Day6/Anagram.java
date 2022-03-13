package Day6;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x : b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				answer = "NO";
			}
			map.put(x, map.get(x) - 1);
		}
		System.out.println(answer);
	}

}
