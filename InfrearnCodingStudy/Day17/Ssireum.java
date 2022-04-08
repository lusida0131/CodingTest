package Day17;
import java.util.*;
import java.io.*;

class Body implements Comparable<Body>{
	int h, w;
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h - this.h;
	}
}
public class Ssireum {
	public static void main(String[] args) throws IOException{
		Ssireum T = new Ssireum();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Body> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			arr.add(new Body(h, w));
		}
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Body ob : arr) {
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

