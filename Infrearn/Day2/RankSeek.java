package Day2;
import java.util.Scanner;

public class RankSeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String answer = "no";
		st = st.toUpperCase().replaceAll("[^A~Z]", "");
		String tmp = new StringBuilder().reverse().toString();
		if(st.equals(tmp)) {
			answer = "YES";
		}
		System.out.println(answer);
	}

}
