class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        dic = {}

        count =0
        arr = []
        

        for i in range(len(nums)):
            ii = nums[i]
            if dic.get(ii,0) != 0:
               pass
            else: 
               
                dic[ii] =1
                arr.append(ii)
        for i in range(len(arr)):
            nums[i] =arr[i]
            count += 1
                
        
        return count
        