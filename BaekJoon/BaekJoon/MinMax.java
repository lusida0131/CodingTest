package BaekJoon;
import java.io.*;
import java.util.*;
public class MinMax {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		int max = arr.get(n - 1);
		int min = arr.get(0);
		System.out.println(min + " " + max);
	}

}
