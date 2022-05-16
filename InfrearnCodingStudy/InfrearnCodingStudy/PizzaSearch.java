package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
class Point {
	int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class PizzaSearch {
	static int n,m, len, answer = Integer.MAX_VALUE;
	static int [] combi;
	static ArrayList<Point> hs,pz = new ArrayList<>();
	public static void DFS(int L, int s) {
		if(L == m) {
			int sum = 0;
			for(Point h : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		}
		else {
			for(int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
		
	}
	public static void main(String[] args) throws IOException{
		PizzaSearch T = new PizzaSearch();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp == 1) {
					hs.add(new Point(i, j));
				}
				if(tmp == 2) {
					pz.add(new Point(i, j));
				}
			}
		}
		len = pz.size();
		combi = new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
