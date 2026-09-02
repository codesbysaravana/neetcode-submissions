class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    /*     int gased = 0; int costed = 0;
        for(int i=0; i<gas.length; i++) {
            gased = gased+gas[i];
            costed = costed+cost[i];
        }

        if(costed > gased) {
            return -1;
        }

        int max = -1;
        for(int i=0; i<gas.length; i++) {
            max = Math.max(max, getMin(gas, cost, i));
        }

        return max;
    }

    public int getMin(int[] gas, int[] cost, int idx) {
        int tank = 0;

        int flag = 0;
        for(int i=idx; i<(gas.length*2)-1; i++) {
            int currIdx = i%gas.length;
            if(currIdx == idx) {
                flag++;
            }         
            if(flag == 2) {
                if(tank == 0) {
                    idx = -1;
                    return idx;
                } else {
                    break;
                }
            }
            tank = tank + gas[currIdx];
            tank = tank - cost[currIdx];
            if(tank < 0) {
                return -1;
            }
        }

        return idx;
    } */

        int startLocation = 0;
        int currTank = 0;
        int totalTank = 0;

        for(int i=0; i<gas.length; i++) {
            int netGas = gas[i] - cost[i];
            
            totalTank += netGas;
            currTank += netGas;

            if(currTank < 0) {
                startLocation = i+1;
                currTank = 0;
            }
        }

        return totalTank >= 0 ? startLocation : -1;
    }
}
