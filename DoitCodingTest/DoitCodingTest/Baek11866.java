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
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			que.offer(i);
		}
		int cnt = 0;
		String str = "<";
		while(!que.isEmpty()) {
			cnt++;
			if(cnt == m) {
				str += que.poll() + ", ";
				cnt = 0;
			}
			else {
				que.offer(que.poll());
			}
		}
		str = str.substring(0, str.length() - 2);
		System.out.print(str + ">");
	}
}
