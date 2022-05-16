package InfrearnCodingStudy;
import java.util.Scanner;

public class MountainTop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String answer = "";
		st = st + "";
		int cnt = 1;
		for(int i = 0; i < st.length() - 1; i++) {
			if(st.charAt(i) == st.charAt(i+1)) {
				cnt++;
			}else {
				answer += st.charAt(i);
				if(cnt > 1) {
					answer += String.valueOf(cnt);
					cnt = 1;	
				}
			}
		}
		System.out.println(answer);
	}

}
