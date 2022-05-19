package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> que = new LinkedList<>();
		
		String str = "";
		
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			if(str.contains("push_back")) {
				String[] spt = str.split(" ");
				int m = Integer.parseInt(spt[1]);
				que.offerLast(m);
			} 
			else if(str.contains("push_front")) {
				String[] spt = str.split(" ");
				int m = Integer.parseInt(spt[1]);
				que.offerFirst(m);
			}
			else if(str.equals("front")) {
				if(que.isEmpty()) {
					bf.append(-1 + "\n");
				}
				else {
					bf.append(que.getFirst() + "\n");
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
			else if(str.equals("pop_front")) {
				if(que.isEmpty()) {
					bf.append("-1\n");
				}
				else {
					bf.append(que.pollFirst() + "\n");
				}
			}
			else if(str.equals("pop_back")) {
				if(que.isEmpty()) {
					bf.append("-1\n");
				}
				else {
					bf.append(que.pollLast() + "\n");
				}
			}
			else if(str.equals("empty")) {
				if(que.isEmpty()) {
					bf.append("1\n");
				}
				else {
					bf.append("0\n");
				}
			}
			else if(str.equals("size")) {
				bf.append(que.size() + "\n");
			}
		}
		System.out.println(bf.toString());
	}

}
