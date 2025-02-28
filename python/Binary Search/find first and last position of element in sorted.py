class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        res= []
        if len(nums)==0 or nums[0] > target or nums[len(nums)-1] < target:
            return [-1,-1]
        res.append(self.bsLower(nums,target))
        res.append(self.bsUpper(nums,target))
        return res
    
    def bsLower(self, nums, t):
        low = 0
        high = len(nums)-1

        while low <= high:
            mid = (low+high)//2
            if nums[mid] >= t: high = mid-1
            else : low = mid+1

        if nums[low] == t: return low
        return -1 
    
    def bsUpper(self, nums, t):

        low = 0
        high = len(nums)-1

        while low <= high:
            mid = (low+high)//2
            if nums[mid] <= t: low = mid+1
            else: high = mid-1
        
        if nums[high] == t: return high
        return -1
