package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek9012 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			int len = str.length();
			
			for(int j = 0; j < len; j++) {
				char chr = str.charAt(j);
				if(chr == '(') {
					stack.push(chr);               // 
				}
				
				else {
					if(stack.isEmpty()) {
						stack.push(chr);
						break;
					}
					else {
						stack.pop();
					}
				}				
			}
			if(stack.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			stack.clear();
		}
		
	}

}
