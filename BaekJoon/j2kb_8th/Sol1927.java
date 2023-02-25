package j2kb_8th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Sol1927 {

	public static void main(String[] args) throws IOException{
		PriorityQueue<Integer> que = new PriorityQueue<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());;
			if(num == 0) {
				if(que.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(que.poll());
				}
			}
			else {
				que.add(num);
			}
		}

	}

}
