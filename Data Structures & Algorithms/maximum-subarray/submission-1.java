class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int max = nums[0];

        if(nums.length == 1) {
            return nums[0];
        }

        for(int i=0; i<nums.length; i++) {
            currSum = Math.max(nums[i], currSum+nums[i]);
            max = Math.max(max, currSum);
        }

        return max;
    }
} 

