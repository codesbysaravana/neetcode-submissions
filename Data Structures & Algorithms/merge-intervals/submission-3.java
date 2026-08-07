class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        for(int i=0; i<intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!list.isEmpty() && list.get(list.size()-1)[1] >= start) {
                int prevEnd = list.get(list.size()-1)[1];
                int prevStart = list.get(list.size()-1)[0];
                end = Math.max(end, prevEnd);
                list.remove(list.size()-1);
                list.add(new int[]{prevStart, end}); 
            } else {
                list.add(new int[] {start, end});
            }
        }   

        int[][] res = new int[list.size()][2];

        for(int i=0; i<list.size(); i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }

        return res;
    }
}
