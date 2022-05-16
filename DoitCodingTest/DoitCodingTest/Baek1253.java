package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1253 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i< n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		Arrays.sort(arr);
		for(int k = 0; k < n; k++) {
			long find = arr[k];
			int i = 0;
			int j = n - 1;
			
			while(i < j) {
				if(arr[i] + arr[j] == find) {
					if(i != k && j != k) {
						cnt++;
						break;
					}
					else if(i == k) {
						i++;
					}
					else if(j == k) {
						j--;					
					}
				}
				else if(arr[i] + arr[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(cnt);
		br.close();
	}

}
