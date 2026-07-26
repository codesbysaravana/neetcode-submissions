class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for ch in s:
            if ch in "([{":
                stack.append(ch)
            else:
                if not stack:
                    return False

                top = stack[-1]

                if ch == ']' and top == '[':
                    stack.pop()
                elif ch == ')' and top == '(':
                    stack.pop()
                elif ch == '}' and top == '{':
                    stack.pop()
                else:
                    return False

        return len(stack) == 0