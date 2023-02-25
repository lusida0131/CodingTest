package j2kb_8th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sol10814 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String [][] str = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			str[i][0] = st.nextToken();
			str[i][1] = st.nextToken();
		}
		Arrays.sort(str, (o1, o2) -> Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));
		for(int i = 0; i < n; i++) {
			System.out.print(str[i][0] + " ");
			System.out.println(str[i][1]);
		}	
	}
}
