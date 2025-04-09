class Solution:
    def findComplement(self, num: int) -> int:
        
        base = 1
        res = 0
        
        while num > 0:
            
            if num % 2 == 0:
                res += base
            
            base *= 2
            num //= 2
        
        return res
        
        
