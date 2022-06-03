package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1715 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			int data = Integer.parseInt(br.readLine());
			pq.add(data);
		}
		int data1 = 0;
		int data2 = 0;
		int sum = 0;
		
		while(pq.size() != 1) {
			data1 = pq.remove();
			data2 = pq.remove();
			sum += data1 + data2;
			pq.add(data1 + data2);
		}
		System.out.println(sum);
	}
}
