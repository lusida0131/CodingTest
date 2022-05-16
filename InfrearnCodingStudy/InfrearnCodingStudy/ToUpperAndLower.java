package InfrearnCodingStudy;

import java.util.*;

public class ToUpperAndLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ch = "";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				ch += Character.toUpperCase(x);
			} else {
				ch += Character.toLowerCase(x);
				
			}
		}
		System.out.println(ch);
	}
}
