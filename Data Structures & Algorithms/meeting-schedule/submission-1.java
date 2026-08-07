/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int[][] mat = new int[intervals.size()][2];
        for(int i=0; i<intervals.size(); i++) {
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;

            mat[i][0] = start;
            mat[i][1] = end;
            System.out.println(start+ " " +end);
        }

        Arrays.sort(mat, (a,b) -> Integer.compare(a[0], b[0]));
        if(mat.length == 0) {
            return true;
        }
        boolean trackOverLap = true; 
        int prevEnd = mat[0][1];

        for(int i=1; i<mat.length; i++) {
            int matStart = mat[i][0];
            int matEnd = mat[i][1];

            if(matStart < prevEnd) {
                return false;
            } else {
                prevEnd = matEnd;
            }
        }

        return true;
    }
}
