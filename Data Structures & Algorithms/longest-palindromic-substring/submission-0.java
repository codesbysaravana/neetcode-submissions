class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        
        String longest = "";
        
        // i is the starting index of the substring
        for (int i = 0; i < s.length(); i++) {
            // j is the ending index of the substring
            for (int j = i + 1; j <= s.length(); j++) {
                
                // Only check if it's a palindrome if it's longer than our current record
                if (j - i > longest.length() && isPalindrome(s, i, j - 1)) {
                    longest = s.substring(i, j);
                }
            }
        }
        
        return longest;
    }

    // Helper method to check if a specific chunk of the string is a palindrome
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}