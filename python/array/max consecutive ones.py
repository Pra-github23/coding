class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:

        maxi = 0
        j = -1
        for i in range(len(nums)):
            if(nums[i] == 1):
                maxi = max(maxi, i-j)
            else:
                j = i
        
        return maxi

      
