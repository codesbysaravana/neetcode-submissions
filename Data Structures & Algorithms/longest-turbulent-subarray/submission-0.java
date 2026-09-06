class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length <= 1) return arr.length;
        
        int max = 1;
        int left = 0;
        
        // LOOP 1: Assume Even is UP (<), Odd is DOWN (>)
        for (int right = 0; right < arr.length - 1; right++) {
            // Equality always breaks the flow
            if (arr[right] == arr[right+1]) {
                left = right + 1;
            }
            else if (right % 2 == 0) {
                // identifying the bad operations (Even should go UP, so DOWN is bad)
                if (arr[right] > arr[right+1]) {
                    left = returnLeft(right); // skip left until right
                } 
            } else if (right % 2 != 0) {
                // identifying the bad operations (Odd should go DOWN, so UP is bad)
                if (arr[right] < arr[right+1]) {
                    left = returnLeft(right); // skip left until right
                }
            }

            // track max: right+1 is the end of our current valid pair
            // size formula: (end - start + 1) -> (right+1 - left + 1)
            max = Math.max(max, right - left + 2);
        }

        left = 0; // reset left for the second pass
        for (int right = 0; right < arr.length - 1; right++) {
            if (arr[right] == arr[right+1]) {
                left = right + 1;
            }
            else if (right % 2 == 0) {
                if (arr[right] < arr[right+1]) {
                    left = returnLeft(right); // skip left until right
                } 
            } else if (right % 2 != 0) {
                if (arr[right] > arr[right+1]) {
                    left = returnLeft(right); // skip left until right
                }
            }

            // track max
            max = Math.max(max, right - left + 2);
        }

        return max;
    }

    // Your helper function
    public int returnLeft(int right) {
        return right+1;
    }
}