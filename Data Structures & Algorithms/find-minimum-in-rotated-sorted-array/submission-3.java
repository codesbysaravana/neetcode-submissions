class Solution {
    public int findMin(int[] nums) {
/*         int max = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            max = Math.min(max, nums[i]);
        }

        return max; */

        int l = 0; int r = nums.length-1;

        while(l < r) {
            int mid = l + (r - l)/2;

            if(nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid+1;
            }
        }

        return nums[l];
    }
}
