class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        
        res = ""
        
        ind = 0
        
        while(ind < len(s)):
            res += s[ind:ind+k][::-1]
            
            res += s[ind+k:2*k+ind]
            
            ind = ind+k*2
        
        
        return res
