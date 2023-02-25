package j2kb_8th;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class review {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i) - 48);
		}
		Collections.sort(list, Comparator.reverseOrder());
		for(int i = 0; i < str.length(); i++) {
			System.out.print(list.get(i));
		}
	}
}
