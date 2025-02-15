class Solution:
    def missingNumber(self, nums: List[int]) -> int:
       
        length = len(nums)
        sum = (length * (length + 1))//2

        for i in nums:
            sum -= i
        
        return sum
