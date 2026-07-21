class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False

        seenFors = [26]
        seenFort = [26]
        sorteds = "".join(sorted(s))
        sortedt = "".join(sorted(t))

        if(sorteds == sortedt):
            return True
        return False
