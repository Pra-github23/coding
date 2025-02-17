class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        maxi = -sys.maxsize
        mini = sys.maxsize

        for i in prices:

            mini = min(mini, i)
            maxi = max(maxi, i - mini)
        
        return maxi
        
