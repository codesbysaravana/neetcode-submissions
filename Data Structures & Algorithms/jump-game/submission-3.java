class Solution {
    public boolean canJump(int[] nums) {
/*         int jump = 0;
        int idx = 0;

        if(nums.length == 1) {
            return true;
        }
        
        while(idx < nums.length-1) {
            idx = idx + nums[idx];  
            if(idx > 1) {
                if(!isPossible(nums, idx)) {
                    idx = idx-1;
                }
            }
            if(idx < nums.length-1) {
                if(nums[idx] == 0) {
                    return false;
                }
            } else {
                return true;
            }
        }

        return false;
    }

    public boolean isPossible(int[] nums, int idx) {
        while(idx < nums.length-1) {  
            if(idx < nums.length-1) {
                if(nums[idx] == 0) {
                    return false;
                }
            } else {
                return true;
            }

            idx = idx + nums[idx];
        }

        return false;
    } */

        //APPORACH 2 SSEEN ANS
        //return isPossible(nums, 0);

        int jump = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(i > max) {
                return false;
            }

            jump = nums[i] + i;
            max = Math.max(max, jump);
        }

        return true;

    }

    public boolean isPossible(int[] nums, int idx) {
        if(idx >= nums.length-1) {
            return true;
        }

        if(nums[idx] == 0) {
            return false;
        }

        int farthest = Math.min(idx + nums[idx], nums.length-1);

        for(int i=farthest; i > idx; i--) {
            if(isPossible(nums, i)) {
                return true;
            }
        }

        return false;
    }
}
