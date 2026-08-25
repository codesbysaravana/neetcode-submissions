class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(res, list, nums, 0);
        
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int idx) {
        res.add(new ArrayList<>(list));

        for(int i=idx; i<nums.length; i++) {
            if(i > idx && nums[i] == nums[i-1] ) {
                continue;
            }

            list.add(nums[i]);
            backtrack(res, list, nums, i+1);
            list.remove(list.size()-1);
        }

        return;
    }
}
