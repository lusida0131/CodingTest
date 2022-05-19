package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek18258 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = "";
		
		Deque<Integer> que = new LinkedList<>();
		StringBuffer bf = new StringBuffer();
		
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			if(str.contains("push")) {
				String spt[] = str.split(" ");
				int m = Integer.parseInt(spt[1]);
				que.offer(m);
			}
			else if(str.equals("front")) {
				if(que.isEmpty()) {
					bf.append("-1\n");
				}
				else {
					bf.append(que.peek() + "\n");
				}
			}
			else if(str.equals("pop")) {
				if(que.isEmpty()) {
					bf.append("-1\n");
				}
				else {
					bf.append(que.poll() + "\n");
				}
			}
			else if(str.equals("size")) {
				bf.append(que.size() + "\n");
			}
			else if(str.equals("empty")) {
				if(que.isEmpty()) {
					bf.append("1\n");
				}
				else {
					bf.append("0\n");
				}
	
			}
			else if(str.equals("back")) {
				if(que.isEmpty()) {
					bf.append("-1\n");
				}
				else {
					bf.append(que.getLast() + "\n");
				}
			}
			
		}
		System.out.println(bf.toString());
	}

}
