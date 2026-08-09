class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        Set<Integer> set = new HashSet<>();
        while(true) {
            int curr = numbers(temp);
            System.out.println(curr);
            if(curr == 1) {
                return true;
            } else if(set.contains(curr)) {
                break;
            }
            set.add(curr);
            temp = curr;
        }
        return false;
    }

    public int numbers(int n) {
        int temp = n;
        int ans = 0;
        while(temp > 0) {
            int d = temp%10;
            d = d*d;
            ans = ans+d;
            temp = temp/10;
        }
        return ans;
    }
}
