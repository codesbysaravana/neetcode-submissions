class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        if(cost.length == 1) {
            return 1;
        }

        dp[0] = 0;
        dp[1] = 0;
        int min = Integer.MAX_VALUE;

        for(int i=2; i<=cost.length; i++) {
            if(min > dp[i]) {
//                dp[i] = dp[i-1] + cost[i-1];
  //              dp[i] = dp[i-2] + cost[i-1];
                dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
            }
        }

        return dp[cost.length];
    }
}
