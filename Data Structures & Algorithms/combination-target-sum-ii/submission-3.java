class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        int idx = 0;

        backtrack(res, list, candidates, target, idx, sum);

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> r : res) {
            ans.add(r);
        }

        return ans;
    }

    public void backtrack(Set<List<Integer>> res, List<Integer> list, int[] nums, int target, int idx, int sum) {
        if(sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(idx == nums.length) {
            return;
        }

        if(sum > target) {
            return;
        }

        list.add(nums[idx]);
        sum = sum + nums[idx];
        backtrack(res, list, nums, target, idx+1, sum);


        sum = sum - list.get(list.size()-1);
        list.remove(list.size()-1);
        while(idx+1 < nums.length && nums[idx] == nums[idx+1]) {
            idx = idx+1;
        }
        backtrack(res, list, nums, target, idx+1, sum);

        return;
    }
}
