package programmers;

import java.util.Arrays;
import java.util.Collections;

public class CreateMin {
	public static void main(String[] args) {
		int []a = {1, 4, 2};
		int []b = {5, 4, 4};
		int answer = 0;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i < a.length; i++) {
        	answer = answer + (a[i] * b[a.length - 1 - i]);
        }
        System.out.println(answer);
	}
}
