package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
class Meet implements Comparable<Meet>{
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
public class MeetingRoom {
	static int n;
	public static void main(String[] args) throws IOException{
		MeetingRoom T = new MeetingRoom();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		ArrayList<Meet> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr.add(new Meet(x, y));
		}
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		for(Meet ob : arr) {
			if(ob.s >= et) {
				cnt++;
				et = ob.e; 
			}
		}
		System.out.println(cnt);
	}
}
