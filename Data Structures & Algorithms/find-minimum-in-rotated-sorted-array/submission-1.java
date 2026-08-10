class Solution {
    public int findMin(int[] nums) {
        int max = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            max = Math.min(max, nums[i]);
        }

        return max;
    }
}
