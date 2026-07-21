class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = [1] * len(nums)

        #java ans.fill(ans, 1)

        preffix = 1
        for i in range(0, len(nums)):
            ans[i] = ans[i]*preffix
            preffix = nums[i]*preffix

        suffix = 1
        for i in range(len(nums)-1, -1, -1):
            ans[i] = ans[i]*suffix
            suffix = nums[i]*suffix
        print("end", end=" ")
        print("now the True ENd")
        return ans