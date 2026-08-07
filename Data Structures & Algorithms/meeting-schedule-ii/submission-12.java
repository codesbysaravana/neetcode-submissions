class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0) {
            return 0;
        }
        int[][] mat = new int[intervals.size()][2];
        int possible = 0;
        for(int i=0; i<intervals.size(); i++) {
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;

            mat[i][0] = start;
            mat[i][1] = end;
            System.out.println(start+ " " +end);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Arrays.sort(mat, (a,b) -> Integer.compare(a[0], b[0]));
        if(mat.length == 0) {
            return 0;
        }

        int prevEnd = mat[0][1];
        pq.add(prevEnd);
        for(int i=1; i<mat.length; i++) {
            int matStart = mat[i][0];
            int matEnd = mat[i][1];
            
                if(matStart >= pq.peek()) { //not overlapping
                    pq.poll();
                    pq.add(matEnd);
                } else if(matEnd >= matStart) { //if its overlapping
                    pq.add(matEnd); 
                }
        }

        return pq.size();
    }
}

