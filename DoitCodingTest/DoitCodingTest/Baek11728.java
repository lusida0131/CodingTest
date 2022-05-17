package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek11728 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aSize = Integer.parseInt(st.nextToken());
		int bSize = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < aSize; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < bSize; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + " ");
		}
		br.close();
		bw.close();
		
	}
}
