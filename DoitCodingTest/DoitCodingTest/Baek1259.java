package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek1259 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String n = br.readLine();
			if(n.equals("0")) {
				break;
			}
			else {
				String st = new StringBuilder(n).reverse().toString();
				if(st.equals(n)) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
		}
	}
}
