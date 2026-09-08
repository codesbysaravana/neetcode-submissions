class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        fib(n, dp);

        return dp[n];
    }

    public int fib(int n, int[] dp) {
        if(n == 0) {
//            return 0;
            dp[0] = 0;
            return dp[0];
        } 
        if(n == 1) {
            dp[1] = 1;
            return 1;
            //return 1;
        }
        if(n == 2) {
            dp[2] = 1;
            return 1;
        }   

        if(dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fib((n-1), dp) + fib((n-2), dp) + fib((n-3), dp);
        return dp[n];

        //return fib(n-1) + fib(n-2) + fib(n-3);
    }
}