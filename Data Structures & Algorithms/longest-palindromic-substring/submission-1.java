class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (j - i > longest.length() && isPalindrome(s, i, j - 1)) {
                    longest = s.substring(i, j);
                }
            }
        }
        
        return longest;
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}