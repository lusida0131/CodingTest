package DoitCodingTest;
import java.io.*;
import java.util.*;

public class Baek1377 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Sort [] arr = new Sort[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new Sort(Integer.parseInt(br.readLine()), i);
		}
		Arrays.sort(arr);
		int max = 0;
		for(int i = 0; i < n; i++) {
			if(max < arr[i].index - i) {
				max = arr[i].index - i;
			}
		}
		System.out.println(max + 1);
	}
}

class Sort implements Comparable<Sort> {
	int value;
	int index;
	public Sort(int value, int index) {
		this.value = value;
		this.index = index;
	}
	@Override
	public int compareTo(Sort o) {
		return this.value - o.value;
	}
}