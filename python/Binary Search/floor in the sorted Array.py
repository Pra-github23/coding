class Solution:
    #User function Template for python3
    
    #Complete this function
    def findFloor(self,arr,k):
        #Your code here
        low = 0
        high =len(arr)-1
        
        while low <= high:
            mid = (high+low)//2
            
            if arr[mid] <= k: low = mid+1
            else: high = mid-1
        
        if high < 0 or high >= len(arr): return -1
        
        return high
