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

            res.add(new ArrayList<>(list));
            

        for(int i=idx; i<nums.length; i++) {
            list.add(nums[i]);
            backtrack(res, list, nums, i+1);
            list.remove(list.size()-1);
        }

        return;
    }
}
