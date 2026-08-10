class Solution {
    public String multiply(String num1, String num2) {
        int[] ans = new int[num1.length() + num2.length()];

        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        for(int i=num1.length()-1; i>=0; i--) {
            for(int j=num2.length()-1; j>=0; j--) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';

                int multiplied = n1*n2;
                int sum = multiplied + ans[i+j+1]; //prev ans
                ans[i+j+1] = sum%10;
                ans[i+j] += sum/10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ans.length; i++) {
            if(ans[i] != 0 || sb.length() != 0) {
                sb.append(ans[i]);
            } 
        }

        return sb.toString();
    }
}


//remember that any two digits multiplied, together, that length would be 
// (len1+len2 = anslen)