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
			if(b.s >= et) {
				cnt++;
				et = b.e;
			}
		}
		System.out.println(cnt);
	}
}
class Meet implements Comparable<Meet> {
	int s, e;
	Meet(int s, int e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Meet o) {
		if(this.e == o.e) {
			return this.s - o.s;
		}
		else {
			return this.e - o.e;
		}
	}
}