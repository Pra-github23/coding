class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        summ  =0
        maxi = -sys.maxsize

        for i in nums:
            summ = max(summ + i, i)
            maxi = max(summ, maxi)
        
        return maxi
