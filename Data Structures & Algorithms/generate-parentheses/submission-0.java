class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        gen(list, n, new StringBuilder());
        return list;
    }

    public void gen(List<String> list, int n, StringBuilder sb) {
        if(sb.length() == n*2) {
            if(isValid(sb.toString())) {
                list.add(sb.toString());
                return;
            } else {
                return;
            }
        }

        sb.append('(');
        gen(list, n, sb);
        sb.deleteCharAt(sb.length()-1);

        sb.append(')');
        gen(list, n, sb);
        sb.deleteCharAt(sb.length()-1);

        return;
    }

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '(' ) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if(c == ')' && top == '(' ) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
