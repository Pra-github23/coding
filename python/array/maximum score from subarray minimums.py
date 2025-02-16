
class Solution:
    def pairWithMaxSum(self, arr):
        # Your code goes here
        if len(arr) == 2:
            return sum(arr)
        
        maxi = 0
        
        for i in range(1,len(arr)-1):
            
            maxi = max(maxi, arr[i]+arr[i-1])
            maxi = max(maxi, arr[i]+arr[i+1])
        
        return maxi
            
    
