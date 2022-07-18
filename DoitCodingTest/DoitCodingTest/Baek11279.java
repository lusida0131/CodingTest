package DoitCodingTest;
import java.util.*;
import java.io.*;
public class Baek11279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			if(m != 0) {
				que.offer(m);
			}
			else {
				if(que.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(que.poll());
				}
			}
		}
	}
}
