package InfrearnCodingStudy;
import java.util.*;
import java.io.*;
class Lecture implements Comparable<Lecture> {
	int money;
	int time;
	public Lecture(int money, int time) {
		this.money = money;
		this.time = time;
	}
	@Override
	public int compareTo(Lecture o) {
		return o.time - this.time;
	}
}
public class MaxIncome {
	static int n, max = Integer.MIN_VALUE;
	public static void main(String[] args)throws IOException {
		MaxIncome T = new MaxIncome();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr.add(new Lecture(x, y));
			if(y > max) {
				max = y;
			}
		}
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for(; j < n; j++) {
				if(arr.get(j).time < i) {
					break;
				}
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) {
				answer += pQ.poll();
			}
		}
		System.out.println(answer);
	}
}
