class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list = new ArrayList<>();

        int[][] ans = new int[intervals.length+1][2];
        for(int i=0; i<intervals.length; i++) {
            ans[i][0] = intervals[i][0];
            ans[i][1] = intervals[i][1];
        }

        ans[ans.length-1][0] = newInterval[0];
        ans[ans.length-1][1] = newInterval[1];

        Arrays.sort(ans, (a,b) -> Integer.compare(a[0], b[0]));

            for(int i=0; i<ans.length; i++) {
                int start = ans[i][0];
                int end = ans[i][1];

                if(!list.isEmpty() && list.get(list.size()-1).get(1) >= start) {
                    
                        end = Math.max(end, list.get(list.size()-1).get(1));
                        int oldStart = list.get(list.size()-1).get(0);
                        list.remove(list.get(list.size()-1));
                        List<Integer> newlist = new ArrayList<>();
                        newlist.add(oldStart);
                        newlist.add(end);
                        list.add(newlist);
                    } else {
                        List<Integer> elseList = new ArrayList<>();
                        elseList.add(start);
                        elseList.add(end);
                        list.add(elseList);
                    
                }
            }

        int[][] res = new int[list.size()][2];
        for(int i=0; i<list.size(); i++) {
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }

        return res;
    }
}
