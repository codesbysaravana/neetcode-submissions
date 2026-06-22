class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];

        Stack<Double> stack = new Stack<>();

        for(int i=0; i<position.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(b[0] ,a[0]));

        for(int i=0; i<arr.length; i++) {
            int d = target - arr[i][0]; //distance left to target
            int speeded = arr[i][1]; 
            double time = (double) d/speeded; //for exact .2 or decimals
            if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
