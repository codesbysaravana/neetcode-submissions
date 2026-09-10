/* class Solution {
    public int countSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        List<String> list = new ArrayList<>();

        backtrack(sb, s, idx, list);

        return list.size();
    }

    public void backtrack(StringBuilder sb, String s, int idx, List<String> list) {
        if(idx == s.length()) {
            return;
        }

        for(int i=idx; i<s.length(); i++) {
            sb.append(s.charAt(i));
//             backtrack(sb, s, i+1, list);
  //          sb.deleteCharAt(sb.length()-1);
    //        backtrack(sb, s, i, list); 
            if(isPal(sb.toString())) {
                list.add(sb.toString());
            }
        }

        sb.setLength(0);
        backtrack(sb, s, idx+1, list);
    }

    public boolean isPal(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }

        return true;
    }
} */



class Solution {
    public int countSubstrings(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        count += expand(s, i, i);
        count += expand(s, i, i + 1);
    }

    return count;
}

private int expand(String s, int l, int r) {
    int count = 0;

    while (l >= 0 && r < s.length()
           && s.charAt(l) == s.charAt(r)) {

        count++;
        l--;
        r++;
    }

    return count;
}
}



