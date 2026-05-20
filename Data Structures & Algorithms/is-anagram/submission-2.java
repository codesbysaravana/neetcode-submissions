class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        /* char[] chars = s.toCharArray();
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

        return Arrays.equals(chars, charst); */

        int[] freq1 = new int[26];

        for(int i=0; i<s.length(); i++) {
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++) {
            freq1[t.charAt(i)-'a']--;
        }

        for(int i=0; i<26; i++) {
            if(freq1[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
