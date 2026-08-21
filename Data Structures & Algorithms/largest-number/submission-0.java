class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();

        String[] strs = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            strs[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(strs, (a,b) -> (b+a).compareTo(a+b));

        if(strs[0].equals("0")) {
            return "0";
        }

        for(String str : strs) {
            sb.append(str);
        }

        return sb.toString();
    }
}