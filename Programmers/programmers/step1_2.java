package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class step1_2 {
	static String answer;
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		 String answer = "";
	        String[] str = new String[numbers.length];
	        for(int i = 0; i < numbers.length; i++) {
	            str[i] = String.valueOf(numbers[i]);
	        }
	        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
	        
	        if(str[0].equals("0")) {
	            System.out.println( "0");
	        }
	        else {
	            for(int i = 0; i < str.length; i++) {
	                answer += str[i];
	            }
	        }
	        System.out.println(answer);
    }
}
