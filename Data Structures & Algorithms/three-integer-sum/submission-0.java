class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int curr = i;
            int left = i+1;
            int right = nums.length-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);

                    set.add(list);

                    left++;
                    right--;
                }

                else if(sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
