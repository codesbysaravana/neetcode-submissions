class Solution:
    def isPalindrome(self, s: str) -> bool:
        replaced = ""

        for ch in s:
            if ch.isalnum():
                replaced += ch.lower()

        left = 0
        right = len(replaced)-1

        while(left < right):
            if(replaced[left] != replaced[right]):
                return False
            left += 1
            right -= 1
        
        return True
