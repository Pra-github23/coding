class Solution:
    def splitArray(self, nums: List[int], k: int) -> int:

        high = sum(nums)
        low = min(nums)
        res = sys.maxsize

        while low <= high:

            mid = (low+high)//2
            boo = self.minimized(nums, mid, k)

            if boo >= 0:
                res = min(res, boo)
                high = mid-1
            else:
                low = mid+1
        
        return res
    
    def minimized(self, nums, mid, k):

        summ = 0
        count = 1
        maxi = -sys.maxsize

        for num in nums:
            if summ+num <= mid:
                summ += num
                
            else:
                count += 1
                maxi = max(maxi, summ)
                summ = num

        maxi = max(maxi, summ)
        if count <= k: return maxi

        return -1 
        
