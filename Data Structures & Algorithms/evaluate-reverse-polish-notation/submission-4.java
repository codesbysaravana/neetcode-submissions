class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++) {
            String s = tokens[i];
            char c = s.charAt(0); //if 13 it takes only 1 IDIOT 

            System.out.println(c);

            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            }

/*             if(Character.isDigit(c)) {
                int ch = Integer.parseInt(s); //still nope for -11
                //int ch = c - '0';
                stack.push(ch);
            } */ else  if(c == '+') {
                int a = stack.pop();
                int b = stack.pop();
                int res = b + a;
                stack.push(res);
            } else if(c == '-') {
                int a = stack.pop();
                int b = stack.pop();
                int res = b - a;
                stack.push(res);
            } else if(c == '*') {
                int a = stack.pop();
                int b = stack.pop();
                int res = b * a;
                stack.push(res);
            } else if(c == '/') {
                int a = stack.pop();
                int b = stack.pop();
                int res = b / a;
                stack.push(res);
            }
        }

        return stack.pop();
    }
}
