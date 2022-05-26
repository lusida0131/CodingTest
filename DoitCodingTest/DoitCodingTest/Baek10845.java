package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> que = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String ch[] = str.split(" ");
				que.offer(Integer.parseInt(ch[1]));
			}
			else if(str.equals("front")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(que.peekFirst());
				}
			}
			else if(str.equals("back")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(que.peekLast());
				}
			}
			else if(str.equals("size")) {
				System.out.println(que.size());
			}
			else if(str.equals("empty")) {
				if(que.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if(str.equals("pop")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(que.pop());
				}
			}
		}
	}

}
