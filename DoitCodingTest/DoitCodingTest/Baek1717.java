package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1717 {
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];
		for(int i = 0; i <= n; i++) { // 대표 노드를 자기 자신으로 초기화하기 
			arr[i] = i;
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(o == 0) {      // 집합 합치기 
				union(a, b);
			}
			else {  // 같은 집합의 원소인지 확인하기 
				if(check(a, b)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
	private static void union(int a, int b) {  // union 연산: 대표 노드끼리 연결하기 
		a = find(a);
		b = find(b);
		if(a != b) {
			arr[b] = a;
		}		
	}
	private static boolean check(int a, int b) { // 두 원소가 같은 집합인지 확인하기 
		a = find(a);
		b = find(b);
		if(a == b) {
			return true;
		}else {
			return false;
		}
	}
	private static int find(int a) { // find 연산 
		if(a == arr[a]) {
			return a;
		}
		else {
			return arr[a] = find(arr[a]);    // 재귀 함수 형태로 구현 -> 경로 압축 부분
		}
		
	}
}
