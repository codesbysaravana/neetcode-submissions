class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        seenFors = [26]*26
        seenFort = [26]*26

        for i in range(0, len(s)):
            seenFors[ ord(s[i]) - ord('a')] += 1

        for i in range(0, len(t)):
            seenFort[ ord(t[i]) - ord('a') ] += 1
        
        return seenFors == seenFort

    def easySort(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False

        sorteds = "".join(sorted(s))
        sortedt = "".join(sorted(t))

        if(sorteds == sortedt):
            return True
        return False