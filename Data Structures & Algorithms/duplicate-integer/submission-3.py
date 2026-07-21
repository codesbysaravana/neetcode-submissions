class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()

        for i in range(0, len(nums)):
            num = nums[i]
            
            if(num in seen):
                return True
            seen.add(num)
        
        return False