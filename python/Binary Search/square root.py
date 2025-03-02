class Solution:
    def floorSqrt(self, n): 
    #Your code here
        if n == 1: return 1
        
        low = 1
        high = n
        
        while low <= high:
            mid = (low + high)//2
            if mid * mid == n: return mid
            
            if mid * mid > n : high = mid -1
            else: low = mid+1
        
        return high
