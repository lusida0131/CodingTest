package InfrearnCodingStudy;
import java.util.Scanner;

public class RockSP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] b = new int [n];
		int [] a = new int [n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) {
				System.out.println("D");
			} else if(a[i] == 1 && b[i] == 2) {
				System.out.println("A");
			} else if(a[i] == 2 && b[i] == 1) {
				System.out.println("A");
			} else if(a[i] == 3 && b[i] == 2) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
			
		}
	}

}
