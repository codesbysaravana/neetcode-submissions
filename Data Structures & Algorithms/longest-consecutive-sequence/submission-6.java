class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int n=1;

        Set<Integer> set = new TreeSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

       int[] r = new int[set.size()];
       int idx=0;
       for(int s : set) {
            r[idx] = s;
            idx++;
       }

        int max = 0;
        for(int i=0; i<r.length-1; i++) {
            if(r[i]+1 == r[i+1]) {
                n++;
            } else {
                max = Math.max(max, n);
                n=1;
            }
        }
        max = Math.max(max, n);
        return max;
    }
}
