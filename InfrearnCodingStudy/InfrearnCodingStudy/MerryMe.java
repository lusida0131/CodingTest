package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
class Merry implements Comparable<Merry> {
	int s;
	char e;
	Merry(int s, char e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Merry o) {
		if(this.s == o.s) {
			return this.e - o.e;
		}
		else {
			return this.s - o.s;
		}
	}
}
public class MerryMe {
	public static void main(String[] args) throws IOException{
		MerryMe T = new MerryMe();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Merry> arr = new ArrayList<Merry>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); 
			int y = Integer.parseInt(st.nextToken());
			arr.add(new Merry(x, 's'));
			arr.add(new Merry(y, 'e'));
		}
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for(Merry ob : arr) {
			if(ob.e == 's') {
				cnt++;
			}
			else {
				cnt--; 
			}
			answer = Math.max(answer, cnt);
		}
		System.out.println(answer);
	}
}
