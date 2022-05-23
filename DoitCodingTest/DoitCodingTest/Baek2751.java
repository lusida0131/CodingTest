package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
			
		}
		Collections.sort(list);
		for(int i = 0; i < n; i++) {
			bf.append(list.get(i) + "\n");
		}
		System.out.println(bf.toString());
	}

}
