class Solution:
    def findMin(self, nums: List[int]) -> int:
        if len(nums) == 1: return nums[0]

        if nums[0] > nums[1] : return nums[1]
        if nums[len(nums)-1] < nums[len(nums)-2]: return nums[len(nums)-1]
        if nums[0] < nums[len(nums)-1]: return nums[0]

        low = 1
        high = len(nums)-2

        while low <= high:
            mid = (low+high)//2

            if nums[mid] >= nums[mid-1] and nums[mid] >= nums[mid+1]:
                return nums[mid +1]
            if nums[mid] >= nums[low]:
                low = mid+1
            else:
                high = mid-1
            
        return nums[low]
        
