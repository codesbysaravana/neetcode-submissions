class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int idx = 0;
        backtrack(res, list, nums, idx);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int idx) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(list.contains(nums[i])) {
                continue;
            }

            list.add(nums[i]);
            backtrack(res, list, nums, i+1);
            list.remove(list.size()-1);
        }

        return;
    }
}
