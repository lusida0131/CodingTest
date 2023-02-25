package j2kb_8th;
import java.io.*;
import java.util.*;
public class Sol10828 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.contains("push")) {
				String [] spt = str.split(" ");
				stack.push(Integer.parseInt(spt[1]));
			}
			else if(str.equals("top")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
				}
			}
			else if(str.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				
			}
			else if(str.equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.pop());
				}
			}
			else {
				System.out.println(stack.size());
			}
		}	
	}
}
