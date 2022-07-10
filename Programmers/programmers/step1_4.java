package programmers;
import java.util.*;
public class step1_4 {

	public static void main(String[] args) {
		int[] A = {1, 3, 5, 7};
		int[] B = {2, 2, 6, 8};
        Arrays.sort(A);
        Arrays.sort(B);
        // a = 1, 3, 5, 7 
        // b = 2, 2, 6, 8  4, 2, 2, 2
        int aIndex = 0;
        int bIndex = 0;
        int answer = 0;
        while (aIndex != A.length && bIndex != B.length) {
            if (A[aIndex] < B[bIndex]) {
                answer++;
                aIndex++;
            }
            bIndex++;
        }
        System.out.println(answer);
	}
}
