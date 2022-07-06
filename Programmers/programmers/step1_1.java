package programmers;

public class step1_1 {
	
	public int solution(int n, int[] stations, int w) {
		 int answer = 0;
	     int now = 1;
	     int idx = 0;
	     while(now <= n) {
	    	 if(idx >= stations.length || now < stations[idx] - w) {
	    		 answer++;
	             now = (w * 2 + 1) + now;
	         }
	         else {
	        	 now = stations[idx] + w + 1;
	             idx++;
	                
	         }
	     }
	     return answer;
	}
}
