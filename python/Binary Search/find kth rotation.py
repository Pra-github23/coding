class Solution:
    def findKRotation(self, arr):
        # code here
        
        if len(arr) == 1:
            return 0
        
        if arr[0] < arr[len(arr)-1]: return 0
        if arr[0] > arr[1] : return 1
        if arr[len(arr)-1] < arr[len(arr)-2]: return len(arr)-1
        
        low = 0
        high = len(arr)-2
        
        while low <= high:
            mid = (low+high)//2
            
            if arr[mid] > arr[mid-1] and arr[mid] > arr[mid+1]:
                return mid+1
            if arr[mid] >= arr[low]:
                low = mid +1
            else: high = mid-1
        
        return low
