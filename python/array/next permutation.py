class Solution:
    def reverse(self,nums):
        i = 0
        j = len(nums)-1
        while i < j:
            nums[i],nums[j] = nums[j],nums[i]
            i += 1
            j -= 1
        
        return nums

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ind = -1

        i = len(nums)-1
        j = i -1

        while(j >= 0):
            if nums[i] > nums[j]:
                ind = j
                break
            i -= 1
            j -= 1
        
        if ind == -1:
            self.reverse(nums)  
            return
        
        nextInd = -1
        i = ind +1
        mini = sys.maxsize

        while i < len(nums):
            if mini > nums[i] and nums[i] > nums[ind]:
                nextInd = i
                mini = nums[i]
            
            i += 1
        
        nums[ind],nums[nextInd] = nums[nextInd],nums[ind]

       
        # nums[ind+1:].sort()
        nums[ind+1:] = sorted(nums[ind+1:])



        


               
