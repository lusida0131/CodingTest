package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<>();
		int num = 1;
		int su = 0;
		
		for(int i = 0; i < n; i++) {
			su = arr[i];
			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
					System.out.println("+");
				}
				stack.pop();
				System.out.println("-");
			}
			else {
				int k = stack.pop();
				if(k < su) {
					System.out.println("no");
					break;
				}
				else {
					System.out.println("-");
				}
			}
		}
	}
}
/*
8
4
3
6
8
7
5
2
1
*/