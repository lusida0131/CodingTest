package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek11866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			que.add(i);
		}
		int cnt = 0;
		int cc = 0;
		while(m != cnt) {
			if(cc % m == 0) {
				list.add(que.poll());
				cc++;
				
			}
			else {
				que.add(que.poll());
				cc++;
			}
			cnt++;
		}
		System.out.println(list);
	}

}
