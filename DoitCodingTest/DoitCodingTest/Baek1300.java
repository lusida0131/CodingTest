package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long start = 1;
		long end = m;
		long answer = 0;
		
		while(start <= end) {
			long mid = (start + end) / 2;
			long cnt = 0;
			for(int i = 1; i <= n; i++) {
				cnt += Math.min(mid / i, n);
			}
			if(cnt < m) {
				start = mid + 1;
			}
			else{
				answer = mid;
				end = mid - 1;
			}
		}
		System.out.println(answer);
	}

}
