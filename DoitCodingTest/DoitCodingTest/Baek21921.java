package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek21921 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int end = 0;
        int sum = 0;
        int max = 0;
        int count = 1;
        for(int i = 0;i < n; i++){
            while((end - i < m) && end < n){
                sum += arr[end];
                end++;
            }
            if(max == sum){
                count++;
            }
            else if(max < sum){
                max = sum;
                count = 1;
            }
            sum -= arr[i];
        }
        if(max == 0){
            System.out.println("SAD");
            return;
        }
        System.out.println(max);
        System.out.println(count);
	}
}
