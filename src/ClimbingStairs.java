
public class ClimbingStairs {

	   public static long climbStairs1(int n) {
	        if (n == 1) {
	            return 1;
	        }
	        long[] dp = new long[n + 1];
	        dp[1] = 1;
	        dp[2] = 2;
	        dp[3] = 4;
	        for (int i = 4; i <= n; i++) {
	            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
	        }
	        return dp[n];   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 44;
		System.out.println(climbStairs1(n));
	}

}
