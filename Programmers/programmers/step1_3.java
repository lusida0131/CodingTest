package programmers;

import java.util.Arrays;

public class step1_3 {

	public static void main(String[] args) {
		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		
		int answer = 0;
        int sum = 0;
        Arrays.sort(budgets);
        for(int i = 0; i < budgets.length; i++) {
            sum += budgets[i];
        }
        int max = 0;
        if(sum > M) {
        	int start = budgets[0];
            int end = budgets[budgets.length - 1];
            sum = 0;
            while(start <= end) {
                int midv = (start + end) / 2;
                sum = 0;
               //midv = 119 124 127
                for(int i = 0; i < budgets.length; i++) {
                    if(midv > budgets[i]) {
                        sum += budgets[i];
                    }
                    else {
                        sum += midv;
                    }
                }
                if(sum > M) {
                    end = midv - 1;  //end 129 
                }
                else {
                	start = midv + 1;
                	answer = midv;
               
                }  
            }
        }
        else {
            answer = budgets[budgets.length - 1];
        }
        System.out.println(answer);
	}
}
