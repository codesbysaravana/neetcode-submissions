class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

/*         char[] chars = s1.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s2.length(); i++) {
            char c = s2.charAt(i);
            int idx = i;
            while(sb.length() <= s1.length()) {
                sb.append(c);
                c = s2.charAt(idx);
            }
            char[] chars2 = sb.toString().toCharArray();
            Arrays.sort(chars2);
            if(Arrays.equals(chars, chars2)) {
                return true;
            } else {
                sb = new StringBuilder();
            }
        }

        return false; */

/*         char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        
        int window = s1.length();    

        for(int i=0; i<=s2.length()-window; i++) {
            String sub = s2.substring(i, i+window);

            char[] chars2 = sub.toCharArray();
            Arrays.sort(chars2);
            if(Arrays.equals(chars1, chars2)) {
                return true;
            }
        }

//why - window() cuz im gonna use up untill window so
        return false; */

        int[] freqs1 = new int[26];
        int[] freqs2 = new int[26];

        for(int i=0; i<s1.length(); i++) {
            freqs1[s1.charAt(i) - 'a']++;
        }
/*         for(int i=0; i<s2.length(); i++) {
            freq[s2.charAt(i) - 'a']++;
        }
 */        
        int left = 0;
        for(int right=0; right<s2.length(); right++) {
            freqs2[s2.charAt(right) - 'a']++;
            if(right- left+1 > s1.length()) { //if window too big
                freqs2[s2.charAt(left) - 'a']--;
                left++;
            }
            if(Arrays.equals(freqs1, freqs2)) {
                return true;
            }
        }

        return false;
    }
}
