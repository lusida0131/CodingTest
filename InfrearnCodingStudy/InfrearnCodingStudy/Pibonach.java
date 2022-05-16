package InfrearnCodingStudy;
import java.util.ArrayList;
import java.util.Scanner;

public class Pibonach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		ArrayList answer = new ArrayList<>();
		answer.add(arr[0] = 1);
		answer.add(arr[1] = 1);
		for(int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			answer.add(arr[i]);
		}
		System.out.println(answer);
	}

}
