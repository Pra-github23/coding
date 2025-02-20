class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:

        i = 0
        
        end = len(nums)
        j = 1
        arr = []
        for k in range(end):

            if nums[k] < 0:
                arr.insert(j,nums[k])
                j += 2
            else:
                arr.insert(i,nums[k])
                i += 2
            
            
        
        return arr
            


        
