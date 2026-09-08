class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (nums.length == 1) return nums[0];
        int[] dp1 = new int[n+2];
        int[] dp2 = new int[n+2];

//skipl last for now
        for(int i=nums.length-2; i>=0; i--) {
            int rob = dp1[i + 2] + nums[i]; 
            int skip = dp1[i + 1];

            dp1[i] = Math.max(rob, skip);
        }

//skip first for now 
        for(int i=nums.length-1; i>=1; i--) {
            int rob = dp2[i + 2] + nums[i]; 
            int skip = dp2[i + 1];

            dp2[i] = Math.max(rob, skip);
        }

        return Math.max(dp1[0], dp2[1]);
    }
}
