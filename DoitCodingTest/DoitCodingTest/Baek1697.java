package DoitCodingTest;
import java.util.*;
public class Baek1697 {
	static int n;
	static int k;
	static int[] arr;
	static Queue<Integer> que = new LinkedList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		if (n >= k) {
            System.out.println(n - k);
        } else {
            System.out.println(BFS());
        }
	}
	private static int BFS() {
		arr = new int[100001];
		que.add(n);
		arr[n] = 1;
		while(!que.isEmpty()) {
			int now = que.poll();
			for(int i = 0; i < 3; i++) {
				int next;
				if (i == 0) {
                    next = now - 1;
                } 
				else if (i == 1) {
                    next = now + 1;
                } 
                else {
                    next = now * 2;
                }
                if (next == k) {
                    return arr[now];
                }
                if (next >= 0 && next < 100001 && arr[next] == 0) {
                    arr[next] = arr[now] + 1;
                    que.add(next);
                }
			}
		}
		return 0;
	}
}
