class Solution:
    def reverseWords(self, s: str) -> str:
        
        res = ""
        
        ind = 0
        st = ""
        
        while ind < len(s):
            
            if s[ind] != ' ':
                st = s[ind]+st
            else:
                res = res+st+" "
                st = ""
            
            ind += 1
        
        return res+st
                
        
