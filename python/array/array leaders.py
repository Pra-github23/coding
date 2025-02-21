class Solution:
    def leaders(self, arr):
        # code here
        
        res =[]
        
        i = len(arr)-1
        
        res.append(arr[i])
        
        i -= 1
        
        while i >= 0:
            
            if res[len(res)-1] <= arr[i]:
                res.append(arr[i])
            
            i -= 1
        
        
        return self.reverse(res)
    
    def reverse(self,res):
        
        i = 0
        j = len(res)-1
        
        while i < j:
            
            res[i],res[j] = res[j],res[i]
            i += 1
            j -= 1
        
        return res
