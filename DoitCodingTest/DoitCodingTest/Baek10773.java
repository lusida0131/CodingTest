package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			if(m != 0) {
				stack.push(m);
			}
			else {
				stack.pop();
			}
		}
		int sum = 0;
		for(int i = 0; i < stack.size(); i++) {
			sum += stack.get(i);
		}
		System.out.println(sum);
	}
}
