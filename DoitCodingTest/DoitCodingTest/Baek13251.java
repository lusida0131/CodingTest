package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek13251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[M];
		double sum = 0.0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			cnt[i] = Integer.parseInt(st.nextToken());
			sum += cnt[i];
		}
		int K = Integer.parseInt(br.readLine());
		
		double answer = 0.0;
		for(int i = 0; i < M; i++) {
			double max = 1.0;
			for(int j = 0; j < K; j++) {
				max *= (cnt[i] - j) / (double)(sum - j);
			}
			answer += max;
		}
		System.out.println(answer);
	}
}
