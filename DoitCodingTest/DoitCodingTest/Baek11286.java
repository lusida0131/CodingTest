package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek11286 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int a1 = Math.abs(o1);
				int a2 = Math.abs(o2);
				if(a1 == a2) {
					return Integer.compare(o1, o2);
				}
				else {
					return Integer.compare(a1, a2);
				}
			}
		});
		
		for(int i = 0 ; i < n ; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(que.size() == 0) {
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
//  [1, -1, 1, 1, -1, -1, 2, -2]