package programmers;
import java.util.*;
import java.io.*;
public class test1_1 {

	public static void main(String[] arsgs) {
		int[] people = {1, 1,1,2, 2, 5,6,7};
		int[] tshirts = {1,1, 2,3,5,4};
		int answer = 0;
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < people.length; i++) {
            for(int j = 0; j < tshirts.length; j++) {
                if(people[i] == tshirts[j]) {
                	cnt++;
                	tshirts[j] = 0;
                	people[i] = 0;
                }
            }
        }
        answer = cnt;
        System.out.println(answer);
	}
}
