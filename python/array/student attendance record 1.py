class Solution:
    def checkRecord(self, s: str) -> bool:
        
        a = 0
        l = 0
        
        ind = 0
        while ind < len(s):
            
            if s[ind] == 'L':
                l += 1
                if l > 2: return False
                ind += 1
                continue
                
            if s[ind] == 'A':
                a += 1
                if a > 1: return False
            l = 0
            ind += 1
        
        return True
