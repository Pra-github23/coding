class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:

        low = 1
        high = max(nums)

        while low <= high:

            mid = (low+high)//2
            boo = self.divisor(nums, threshold, mid)

            if boo :
                high = mid -1
            else: low = mid +1
        
        return low

    def divisor(self, nums, threshold, mid):
        count = 0
        for i  in nums:

            count += i//mid
            if i % mid > 0:
                count += 1

        return count <= threshold    
