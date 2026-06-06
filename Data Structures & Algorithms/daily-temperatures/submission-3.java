class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res= new int[temperatures.length];
        int idx = 0;
        for(int i=0; i<temperatures.length; i++) {
            int countUntilWarmer = 0;
            for(int j=i+1; j<temperatures.length; j++) {
                countUntilWarmer++;
                if(temperatures[j] > temperatures[i]) {
                    res[i] = countUntilWarmer;
                    idx++;
                    break;
                }
            }
        }

        return res;
    }
}

//why stack here
// new day, new ans can solve the previous unsolved stacks man
// understand that, every unsolved day is stored in stack until future day is appeared to solve
// stack stores repeated values