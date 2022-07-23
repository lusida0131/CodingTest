package DoitCodingTest;
import java.util.*;
import java.io.*;

public class Baek9375 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 1;
		for(int i = 0; i < n; i++) {
			HashMap<String, Integer> hash = new HashMap<>();
			answer = 1;
			int m = Integer.parseInt(br.readLine());
			for(int j = 0; j < m; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String clo = st.nextToken();
				String qwe = st.nextToken();
				hash.put(qwe, hash.getOrDefault(qwe, 0) + 1);
			}
			Set<String> keySet = hash.keySet();
			for(String key : keySet) {
				answer *= hash.get(key) + 1;
			}
			System.out.println(answer - 1);
		}
	}

}
