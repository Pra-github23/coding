class Solution:
    def search(self, nums: List[int], target: int) -> bool:

        if len(nums)== 1 :
            return nums[0] == target
        
        
        if nums[0] == target: return True
        if nums[len(nums)-1] == target: return True

        if nums[0] > nums[1]:
            return self.searchTarget(nums, 1, len(nums)-1, target)
        if nums[len(nums)-1] < nums[len(nums)-2]:
            return self.searchTarget(nums, 0, len(nums)-2, target)

        low = 1
        high = len(nums)-2

        while low <= high:

            mid = (low+high)//2

            if nums[mid] > nums[mid-1] or nums[mid] > nums[mid+1]:
                low = mid +1
                break
            if nums[mid] < nums[mid-1] or nums[mid] < nums[mid+1]:
                low = mid
                break
            flag  = 0
            while low+1  <= high and nums[low+1] == nums[low]:
                low = low + 1
                flag = 1
                
                
            while high-1 >= low and nums[high -1] == nums[high]:
                high = high -1
                flag = 1
            
            if flag == 1: continue
                

            if nums[mid] >= nums[low]:
                low = mid + 1
            else: high = mid - 1
        print(low)
        if self.searchTarget(nums, 0, low-1, target): return True
        return self.searchTarget(nums, low, len(nums)-1, target)
    
    def searchTarget(self, nums, low, high, target):

        while low <= high:
            mid = (low+high)//2

            if nums[mid] == target: return True
            if low+1  < len(nums) and nums[mid] == nums[low]:
                low = mid + 1
                continue
                
            if high-1 >= 0 and nums[mid] == nums[high]:
                high = mid -1
                continue
            if nums[mid] > target:
                high = mid -1
            else: low = mid +1
        
        return False

           
        
