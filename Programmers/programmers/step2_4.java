package programmers;

public class step2_4 {

	public static void main(String[] args) {
		int[][] tri = {{7},
				{3, 8},
				{8, 1, 0},
				{2, 7, 4, 4},
				{4, 5, 2, 6, 5}};
		int [][]dp = new int[tri.length][tri[tri.length - 1].length];
		int answer = 0;
		int max = 0;
		dp[0][0] = tri[0][0];
		for(int i = 1; i < tri.length; i++) {
			dp[i][0] = dp[i - 1][0] + tri[i][0];
			dp[i][i] = dp[i - 1][i - 1] + tri[i][i];
			for(int j = 1; j <= i - 1; j++) {
				dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + tri[i][j];
				answer = Math.max(answer, dp[i][j]);
			}
		}
		System.out.println(answer);
	}
}

// (0, 0) (1, 0), (2, 0), (2, 1), (
//(0, 0) ()