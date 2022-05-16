package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2018 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 1;
		int cnt = 1;
		int end_index = 1;
		int start_index = 1;
		while(end_index != n) {
			if(sum == n) {
				cnt++;
				end_index++;
				sum = sum - start_index;
			}
			else if(sum > n) {
				sum = sum - start_index;
				start_index++;
			}
			else {
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(cnt);
	}
}
