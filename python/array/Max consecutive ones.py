class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        
        maxi = 0
        
        i = 0
        count = 0
        
        while i < len(nums):
            
            if nums[i] == 1:
                count += 1
                maxi = max(maxi, count)
                
            else : count = 0
            
            i += 1
        
        return maxi
                
        
