class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        char[] charst = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(charst);

        int idx = 0;
        while(idx < chars.length) {
            if(chars[idx] != charst[idx]) {
                return false;
            }
            idx++;
        }

        return true;
    }
}
