class Solution:
    def countFreq(self, arr, target):
        #code here
        if arr[0] > target or arr[len(arr)-1] < target: return 0
        
        low = 0
        high = len(arr)-1
        
        while low <= high:
            mid =(low+high)//2
            if arr[mid] <= target: low = mid+1
            else: high = mid-1
        
        
        if arr[high] != target: return 0
        
        l = 0
        h = len(arr)-1
        
        while l <= h:
            mid = (l+h)//2
            
            if arr[mid] >= target: h = mid-1
            else: l = mid+1
            
        return high-l+1
