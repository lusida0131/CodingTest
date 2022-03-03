package Day1;

import java.util.*;

public class SearchChar {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch = sc.next().charAt(0);
		st = st.toUpperCase();
		ch = Character.toUpperCase(ch);
		for(int i = 0; i < st.length(); i++) {
			if(st.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
