class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(res, list, nums, target, 0, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int target, int idx, int sum) {
        if(sum > target) {
            return;
        }

        if(sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        if(idx == nums.length) {
            return;
        }
            
            list.add(nums[idx]); sum = sum + nums[idx];
            backtrack(res, list, nums, target, idx, sum);
            sum = sum - list.get(list.size()-1);
            list.remove(list.size()-1);
            backtrack(res, list, nums, target, idx+1, sum); 

        return;
    }
}
