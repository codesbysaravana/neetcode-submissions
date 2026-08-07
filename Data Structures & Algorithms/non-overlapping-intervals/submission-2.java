/* class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int count = 0;
        for(int i=0; i<intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!list.isEmpty() && list.get(list.size()-1)[1] > start) {
                int prevStart = list.get(list.size()-1)[0];
                int prevEnd = list.get(list.size()-1)[1];

                end = Math.max(end, prevEnd);
                list.remove(list.size()-1);
                list.add(new int[]{prevStart, end});
                count++;
            } else {
                list.add(new int[]{start, end});
            }
        }  

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
        }
        return count; 
    }
}
 */

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        int count = 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];

        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] < prevEnd) {
                count++;
                prevEnd = Math.min(prevEnd, intervals[i][1]);
            } else {
                prevEnd = intervals[i][1];
            }
        }

        for(int i=0; i<intervals.length; i++) {
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }
        return count; 
    }
}


