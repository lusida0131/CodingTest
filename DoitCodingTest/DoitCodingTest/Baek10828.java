package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek10828 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int m = 0;
		String str = "";
		for(int i = 0; i < n; i++) {
			str = br.readLine();
		
			if(str.contains("push")) {
				String spt[] = str.split(" ");
				stack.push(Integer.parseInt(spt[1]));
			}
			else if(str.equals("top")) {
				if(stack.empty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
				}
			}
			else if(str.equals("size")) {
				System.out.println(stack.size());
			}
			else if(str.equals("empty")) {
				if(stack.empty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if(str.equals("pop")) {
				if(stack.empty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.pop());
				}	
			}
		}	
	}
}
