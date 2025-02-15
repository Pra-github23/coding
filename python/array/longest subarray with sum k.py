
class Solution:
    def longestSubarray(self, arr, k):  
        # code here
        
        l= []
        summ =0
        for i in arr:
            summ += i
            l.append(summ)
        
        dic ={}
        
        dic[0]=-1
        maxi =0
        
        for i in range(len(arr)):
            
            if(dic.get(l[i] -k, -2) != -2):
                
                maxi = max(maxi,i- dic.get(l[i]-k))
            
            if(dic.get(l[i],-2) == -2):
                dic[l[i]] = i
          
        return maxi
    
