class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        /* StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        String track = "";
        for(String str : wordDict) {
            set.add(str);
            track = track + str;
        }
        recurse(s, 0, sb, set);

        if(track.equals(sb.toString())) {
            return true;
        }

        return false; */

        Set<String> set = new HashSet<>();
        String track = "";
        for(String str : wordDict) {
            set.add(str);
            track = track + str;
        }

        Boolean[] seen = new Boolean[s.length()];
        return recurse(s, set, 0, seen);
    }

    public boolean recurse(String s, Set<String> set, int idx, Boolean[] seen) {
        if(idx == s.length()) {
            return true;
        }

        if(seen[idx] != null) {
            return seen[idx];
        }

        boolean res = false;
        for(int i = idx+1; i <= s.length(); i++) {
            String sub = s.substring(idx, i);
            if(set.contains(sub)) {
                if(recurse(s, set, i, seen)){
                    seen[idx] = true;
                    return true;    
                }
            } 
        }

        seen[idx] = false;
        return res;
    }
}


//memoization dp for rememrbring and avoiding TLE