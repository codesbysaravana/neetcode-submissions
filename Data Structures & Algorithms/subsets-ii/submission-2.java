class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        backtrack(res, list, nums, 0);
        
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> r : res) {
            ans.add(r);
        }

        return ans;
    }

    public void backtrack(Set<List<Integer>> res, List<Integer> list, int[] nums, int idx) {
        if(idx == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

            list.add(nums[idx]);
            backtrack(res, list, nums, idx+1);
            list.remove(list.size()-1);
            backtrack(res, list, nums, idx+1);

        return;
    }
}
