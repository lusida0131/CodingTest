package Day1;

import java.util.Scanner;

public class EngReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		String st = sc.next();
		char [] ar = st.toCharArray();
		int lt = 0;
		int rt = st.length() - 1;
		while(lt < rt) {
			if(!Character.isAlphabetic(ar[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(ar[rt])) {
				rt--;
			} else {
				char len = ar[lt];
				ar[lt] = ar[rt];
				ar[rt] = len;
				lt++;
				rt--;
				
			}
		}
		answer = String.valueOf(ar);
		System.out.println(ar);
	}

}
