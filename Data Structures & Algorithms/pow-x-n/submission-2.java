class Solution {
    public double myPow(double x, int n) {
        double temp = x;    
        long N = (long) n;
        
        if(N < 0) {
            x = 1/x;
            temp = x;
            N = (long) n*-1;
        }

        double ans = 1.0;
        while(N > 0) {
            if(N%2 == 1) {
                ans = ans*x;
                N = N-1;
            } else if(N%2==0) {
                x = x*x; //binary exponetutation, square the base
                N=N/2; //half the pwoer 
            }
        }

        return ans;
    }
}
