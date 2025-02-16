class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i =0
        j =len(nums)-1
        n = len(nums)

        while(i < j):
            while i < n and nums[i] != 2: i += 1
            while j >= 0 and nums[j] == 2: j -= 1

            if i < j:
                nums[i],nums[j] = nums[j],nums[i]

        i =0
        while i < j:
            while i < n and nums[i] != 1: i += 1
            while j >= 0  and nums[j] == 1: j -= 1

            if i < j:
                nums[i],nums[j] = nums[j],nums[i]
                    
        
