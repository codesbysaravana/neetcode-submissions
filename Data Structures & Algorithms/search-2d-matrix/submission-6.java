class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++) {
            int[] curr = matrix[i];
            boolean ans = bs(curr, target);

            if(ans) {
                return true;
            }
        }

        return false;
    }

    public boolean bs(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(nums[mid] == target) {
                return true;
            } else if(nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return false;
    }
}

