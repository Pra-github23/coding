class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        if len(nums) == 1:
            return nums[0]
        
        dic = {}
        count = len(nums)//2
        ans = -1

        for i in nums:
            if dic.get(i) is not None:
                dic[i] = dic.get(i)+1
                if dic[i] > count:
                    ans = i
                    break
                    
            else: 
                dic[i] = 1
        
        if ans == -1:
            ans = nums[0]
        
        return ans
                    
