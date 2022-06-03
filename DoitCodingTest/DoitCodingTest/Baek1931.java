package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Meet> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new Meet(x, y));
		}
		int cnt = 0;
		Collections.sort(list);
		int et = 0;
		for(Meet b : list) {
			if(b.x > et) {
				cnt++;
				et = b.y;
			}
		}
		System.out.println(cnt);
	}
}
class Meet implements Comparable<Meet> {
	int x;
	int y;
	Meet(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Meet o) {
		if(this.x == o.x) {
			return this.y - o.y;
		}
		return this.x - o.x;
	}
}