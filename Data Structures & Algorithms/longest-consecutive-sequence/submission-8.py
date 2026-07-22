class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()

        MAX = 0

        for num in nums:
            seen.add(num)
        
        for num in seen:
            if num-1 not in seen:
                    
                curr = num
                sequence = 1

                while curr + 1 in seen:
                    sequence +=1
                    curr = curr+1
                
                MAX = max(MAX, sequence)

        return MAX