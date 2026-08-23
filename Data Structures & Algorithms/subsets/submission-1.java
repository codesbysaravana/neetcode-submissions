public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        backtrack(res, list, nums, 0);
        return res;
    }

    public int backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int idx) {
        res.add(new ArrayList<>(list)); 
         
        for(int i=idx; i<nums.length; i++) {
            list.add(nums[i]); System.out.println(nums[i]);
            backtrack(res, list, nums, i+1);
            list.remove(list.size()-1);
        }

        return 0;
    }
}