class Solution:
    def rowWithMax1s(self, arr):
        # code here
        res = -1
        maxi = 0
        
        for i in range(len(arr)):
            low = 0
            high = len(arr[0])-1
            
            while low <= high:
                mid = (low+high)//2
                if arr[i][mid] == 1:
                    high = mid - 1
                else: low = mid + 1
            if len(arr[0]) - low > maxi:
                maxi = len(arr[0]) - low
                res = i
        
        return res
                    
