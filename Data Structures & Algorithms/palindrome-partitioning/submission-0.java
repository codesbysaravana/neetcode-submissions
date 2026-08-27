class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();

        backtrack(res, s, list, 0);

        return res;
    }

    public void backtrack(List<List<String>> res, String s, List<String> list, int idx) {
        if (idx == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            String sub = s.substring(idx, i + 1);

            if (isPal(sub)) {
                list.add(sub);
                // System.out.println(sub);
                backtrack(res, s, list, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPal(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
