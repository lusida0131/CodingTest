package Day3;
import java.io.*;
import java.util.*;
public class AvgHigh {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			double sum = 0;
			int [] avg = new int[m];
			for(int j = 0; j < m; j++) {
				int val= Integer.parseInt(st.nextToken());
				avg[j] = val; 
				sum += val;
			}
			double answer = 0;
			answer = sum / m;
			double cnt = 0;
			for(int j = 0; j < m; j++) {
				if(avg[j] > answer) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/m)*100);
		}
		
	}

}
