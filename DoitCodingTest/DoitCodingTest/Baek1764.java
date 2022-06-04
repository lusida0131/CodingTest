package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1764 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		ArrayList<String> answer = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			String tmp = br.readLine();
			if(set.contains(tmp)) {
				answer.add(tmp);
			}
		}
		Collections.sort(answer);
		System.out.println(answer.size());
		for(int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
