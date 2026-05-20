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

        char[] chars1 = s1.toCharArray();
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
        return false;
    }
}
