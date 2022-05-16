package InfrearnCodingStudy;
import java.util.ArrayList;
import java.util.Scanner;

public class LookStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
	
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[1];
		for(int i = 1; i < n; i++) {
			int len = arr[i];
			if(len > max) {
				max = len;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
