class Solution:
    def maxLen(self, arr):
        # code here
        
        dic ={}
        dic[0] = -1
        
        maxi = 0
        summ =0
        
        for i in range(len(arr)):
            
            summ += arr[i]
            if summ in dic:
                maxi = max(maxi, i - dic[summ])
            
            else:
                dic[summ] = i
        
        return maxi
