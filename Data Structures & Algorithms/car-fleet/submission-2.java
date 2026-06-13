/* class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<position.length; i++) {
            int curr = position[i];
            Set<Integer> set = new HashSet<>();
            while(curr <= target) {
                 set.add(curr);
                System.out.println(curr);
                curr = curr + speed[i]; 
            }
        }

        return stack.peek();
    }
} */

//my drawbacks where when what if car A passes at mrg and car B at noon
//idiot different timing how can set be accurate?

// use the formula of s = d/t and t = d/s
//distance = target - position[i];



class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int n = position.length;
        int[][] pack = new int[n][2];
        for(int i=0; i<position.length; i++) {
            pack[i][0] = position[i];
            pack[i][1] = speed[i];
        }
        Arrays.sort(pack, (a, b) -> Integer.compare(b[0], a[0]));

        for(int i=0; i<pack.length; i++) {
            int d = target - pack[i][0];
            double time = (double) d/pack[i][1];
            if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            System.out.println(time);
        }

        return stack.size();
    }
}

//only add cars into stack, time which is really slowed cars add to stack