class Solution:
    def check(self, nums: List[int]) -> bool:

        if len(nums) <= 2: return True

       
        count = 0
        ind = -1

        for i in range(1,len(nums)):

            if(nums[i-1] > nums[i]):
                count += 1
                if count >= 2: return False
                ind = i - 1

        if ind > -1 and nums[0] < nums[len(nums)-1]: return False

        return True