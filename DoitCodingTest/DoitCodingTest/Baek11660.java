package DoitCodingTest;
import java.util.*;
import java.io.*;
public class Baek11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [][] arr = new int[n+1][n+1];
		int starti, startj, endi, endj, sum,sum2 = 0;
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 1; i <= m; i++) {    
			st = new StringTokenizer(br.readLine());
			starti = Integer.parseInt(st.nextToken());  //1
			startj = Integer.parseInt(st.nextToken());  //1 
			endi = Integer.parseInt(st.nextToken());    //4
			endj = Integer.parseInt(st.nextToken());    //4
			sum = 0;
			if(startj == endj && starti == endi) {
				sum2 = arr[starti][startj];
				System.out.println(sum2);		
			}
			else {
				for(int k = starti; k <= endi; k++) {
					for(int j = starti; j <= endj; j++) { 
						sum += arr[k][j]; 
					}
				}
				System.out.println(sum);		
			}
		}
	}
}
//arr
// 1 2 3 4
//2 3 4 5
//3 4 5 6
//4 5 6 7

//answer 
//2 2 3 4
//3 4 3 4
//1 1 4 4


// s[4- 2]s