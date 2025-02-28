class Solution:
    def getFloorAndCeil(self, x: int, arr: list) -> list:
        # code here
        low = 0
        high =len(arr)-1
        
        res = [-1,-1]
        
        arr.sort()
        
        while low <= high:
            mid = (low+high)//2
            if arr[mid] == x: 
                high = low = mid
                break
            if arr[mid] < x: low = mid +1
            else: high = mid -1
        
        if high >=0 and high < len(arr): res[0] =arr[high]
        if low >= 0 and low < len(arr): res[1] = arr[low]
        
        return res
