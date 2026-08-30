class Solution {
    public int findMin(int[] nums) {
        /* int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            min = Math.min(nums[i], min);
        }

        return min; */

        int low = 0;
        int high = nums.length-1;

        while(low < high) {
            int mid = low + (high - low)/2;

            if(nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid+1;
            }
        }

        return nums[low];
    }
}
