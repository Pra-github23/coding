class Solution:
    def search(self, nums: List[int], target: int) -> int:

        if len(nums) == 0:
            if nums[0] == target: return 0
            return -1


        low = 0
        high = len(nums)-1
        if nums[low] <= nums[high]:
            return self.searchTarget(nums, low, high, target)
        # peek = -1
        while low <= high:
            mid = (low+high)//2
            if nums[mid] >= nums[mid+1] and (mid -1 < 0  or nums[mid] >= nums[mid-1]):
                low = mid + 1
                break
            if nums[mid] >= nums[low]:
            
                low = mid + 1
            else: high = mid - 1
        
        # if peek == -1: 
        print(low)
        r = self.searchTarget(nums, 0, low-1, target)
        if r != -1: return r
        # print(peek)
        return self.searchTarget(nums, low, len(nums)-1, target)
    def searchTarget(self, nums, low, high, target):

        while low <= high:
            mid = (low+high)//2
            if nums[mid] == target: return mid
            if nums[mid] > target:
                high = mid - 1
            else: low = mid + 1
        
        return -1

        
