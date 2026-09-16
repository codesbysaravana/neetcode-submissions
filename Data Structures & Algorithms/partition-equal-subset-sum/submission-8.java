class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {   
//        List<Integer> list1 = new ArrayList<>();
  //      List<Integer> list2 = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            total = total + nums[i];
        }

        dp = new Boolean[nums.length][total+1];

        if(total%2 != 0) {
            return false;
        }

        int target = total/2;

        return subset(nums, target, 0, 0);

/*         int flag = 0;
        for(int i=0; i<list1.size(); i++) {
            int rev = list2.size()-1;
            
            System.out.println(list1.get(i));
            System.out.println(list2.get(rev = i));

            if(list1.get(i) == list2.get(i)) {
                if(list1.get(i) != total) {
                    return true;
                }
            }
        }

        return false; */
    }  

    public boolean subset(int[] nums, int target, int idx, int sum) {
        boolean curr = false;
        if(idx == nums.length) {
            return false;
        }

        if(sum == target) {
            return true;
        }

        if(sum > target) {
            return false;
        }

        if(dp[idx][sum] != null) {
            return dp[idx][sum];
        } 

        sum = sum + nums[idx];
        boolean take = subset(nums, target, idx+1, sum);
        
        sum = sum - nums[idx];
        boolean skip = subset(nums, target, idx+1, sum);
        
        dp[idx][sum] = take || skip;

        return dp[idx][sum];
    }
}


//logic 

//s1 == s1, 
 //   if s = 20; s/2 = (s1)
//meaning s1 and s2 are halfs,
//so a half of  subset total if it is equal to s/2 thats the answer
