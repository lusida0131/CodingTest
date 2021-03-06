package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		dNode root = new dNode();
		while(n > 0) {
			String str = br.readLine();
			dNode now = root;
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(now.next[ch - 'a'] == null) {
					now.next[ch - 'a'] = new dNode();
				}
				now = now.next[ch - 'a'];
				if(i == str.length() - 1) {
					now.isEnd = true;
				}
			}
			n--;
		}
		int count = 0;
		while(m > 0) {
			String str = br.readLine();
			dNode now = root;
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(now.next[c - 'a'] == null) {
					break;
				}
				now = now.next[c - 'a'];
				if(i == str.length() - 1 && now.isEnd) {
					count++;
				}
			}
			m--;
		}
		System.out.println(count);
	}

}
class dNode {
	dNode[] next = new dNode[26];
	boolean isEnd;
}