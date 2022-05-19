package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1874 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int num = 1;
		boolean result = true;
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		
		for(int i = 0; i < n; i++) {
			int su = arr[i];
			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}
			else {
				int k = stack.pop();
				if(k < su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {

					bf.append("-\n");
				}
			}
		}
		if(result) {
			System.out.println(bf.toString());
		}
	}
}
