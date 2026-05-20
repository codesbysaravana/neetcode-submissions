class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        int sum = 0;
        while(i < j) {
            sum = numbers[i] + numbers[j]; 
            if(sum == target) {
                if(i != j) {
                    if(i < j) {
                        return new int[]{i+1, j+1};
                    } else {
                        return new int[]{j+1, i+1};
                    }
                }
            } else if(sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1, -1};
    }
}
