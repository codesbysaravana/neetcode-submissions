class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];

        int[] dp = new int[nums.length+2];

        for(int i = nums.length-1; i>=0; i--) {
            int rob = nums[i] + dp[i+2];
            int skip = dp[i+1];

            dp[i] = Math.max(rob, skip);
        }

        return dp[0];
    }
}
