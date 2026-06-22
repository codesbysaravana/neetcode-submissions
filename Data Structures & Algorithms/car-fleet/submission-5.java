class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];

        Stack<Double> stack = new Stack<>();

        for(int i=0; i<position.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(b[0] ,a[0]));

        int fleets = 0;
        double slowestTimeCar = 0.0;
        for(int i=0; i<arr.length; i++) {
            int d = target - arr[i][0]; //distance left to target
            int speeded = arr[i][1];
            double time = (double) d/speeded; //for exact decimals
            if(time > slowestTimeCar) { //form a new fleet if the curr car takes most time
                fleets++;
                slowestTimeCar = time;
            }
            /* if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            } */
        }

//        return stack.size();
        return fleets;
    }
}

//my quizzes?
//why do we need to pack the pos and speed together in a array
//cuz they belong to the same physical car entity 

//we dont actually need to use stack here too 

/* 2. Why sort it descending (closest to target first)?
    position sorted in descending order, cuz the car at say 9th is close to target(10), 
    but a care at 4 pos 
    is bound to crash at the car at starting position!!, thats why we sort from closest to end 
*/


//we dont need stack cuz we need the amount of fleets to be formed properly
// so we can do is, update the fleet if any new car which is slower than last
