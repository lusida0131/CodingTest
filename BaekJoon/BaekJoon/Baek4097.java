package BaekJoon;
import java.util.*;

public class Baek4097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int max = Integer.MIN_VALUE;
			int sum = 0;
			int[] arr = new int[n];
			if(n == 0) {
				break;
			}
			else {
//				for(int i = 0; i < n; i++) {
//					int num = sc.nextInt();
//					sum += num;                // -3, 1, 10, 8, 3, 11
//					max = Math.max(max, sum);  // 0, 1, 10, 10, 10, 11
//					if(sum < 0) {
//						sum = 0;
//					}
//				}
				for(int i = 0; i < n; i++) {
					int x = sc.nextInt();
	                arr[i] = x;

	                if(i > 0) {
	                    int y = arr[i-1];

	                    if(x + y > x) {   //직전 값과 현재 idx의 값을 더한게 더 클 때
	                        arr[i] = x + y;
	                    }
	                }
	                max = Math.max(max, arr[i]);
				
				}
			}
			System.out.println(max);
		}
	}
}
