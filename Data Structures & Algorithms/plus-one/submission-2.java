class Solution {
    public int[] plusOne(int[] digits) {
        long num = 0;
        
        for(int i=0; i<digits.length; i++) {
            int d = digits[i];
            num = num*10+d;
            System.out.print(num + " ");
        }

        num = num+1;
    
        int countofnum = Long.toString(num).length();
        int[] arr = new int[countofnum];
        int ans = 0; int idx = countofnum-1;
        
        while(num > 0 && idx >= 0) {
            int d = (int)(num % 10);
            arr[idx] = d;
            num = num/10;
            idx--;
        }

        return arr;
    }
}