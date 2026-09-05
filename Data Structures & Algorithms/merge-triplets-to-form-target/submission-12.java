class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
       /* int[] start = triplets[triplets.length-1];

        if(Arrays.equals(start, target)) {
            return true;
        }

        for(int i=0; i<triplets.length-1; i++) {
            int[] curr = triplets[i];
            if (curr[0] > target[0] || curr[1] > target[1] || curr[2] > target[2]) {
                continue; 
            }

            int first = curr[0];
            int second = curr[1];
            int third = curr[2];

            if(triplets[i+1][0] != target[0]) {
                int merged = Math.max(triplets[i+1][0], first);
                if(merged <= target[0]) {
                    triplets[i+1][0] = merged;
                }
            }
            if(triplets[i+1][1] != target[1]) {
                int merged = Math.max(triplets[i+1][1], second);
                if(merged <= target[1]) {
                    triplets[i+1][1] = merged;
                }
            }
            if(triplets[i+1][2] != target[2]) {
                int merged = Math.max(triplets[i+1][2], third);
                if(merged <= target[2]) {
                    triplets[i+1][2] = merged;
                }
            }

            int[] trip = triplets[i+1];
            if(Arrays.equals(trip, target)) {
                return true;
            }
        }
 
        int[] trip = triplets[triplets.length-1];

        if(Arrays.equals(trip, target)) {
            return true;
        }
 
        return false; */
        
        int maxFirst = 0;
        int maxSecond = 0;
        int maxThird = 0;

        for(int i=0; i<triplets.length; i++) {
            int[] curr = triplets[i];

            if(curr[0] > target[0] || curr[1] > target[1] || curr[2] > target[2]) {
                continue;
            }

            maxFirst = Math.max(maxFirst, curr[0]);
            maxSecond = Math.max(maxSecond, curr[1]);
            maxThird = Math.max(maxThird, curr[2]);
        }

        int[] arr = new int[3];
        arr[0] = maxFirst;
        arr[1] = maxSecond;
        arr[2] = maxThird;

        return Arrays.equals(arr, target);
    }
}
