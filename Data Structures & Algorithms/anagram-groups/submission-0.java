class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<List<String>> set = new HashSet<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            if(map.get(sorted) == null) {
                map.put(sorted, new ArrayList<>());
            } 
            map.get(sorted).add(str);
        }

/*         List<List<Stringr>> res = new ArrayList<>();
        res.addAll(map);
 */

        return new ArrayList<>(map.values());
    }
}
