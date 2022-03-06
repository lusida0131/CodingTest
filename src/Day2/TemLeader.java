package Day2;
import java.util.Scanner;

public class TemLeader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int n = sc.nextInt();
		String answer = "";
		for(int i = 0; i < n; i++) {
			String tmp = st.substring('#', 1).substring('*', 0);
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
			st = st.substring(7);
			
		}
	}

}
