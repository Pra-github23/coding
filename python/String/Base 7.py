class Solution:
    def convertToBase7(self, num: int) -> str:
        
        if num == 0: return "0"
        
        res = []
        sign = 0
        
        if num < 0:
            sign = 1
            num = abs(num)
        
        while num > 0:
            
            res.append(str(num%7))
            num //= 7
        
        if sign == 1:
            res.append("-")
            
        
        return ''.join(res[::-1]) 
        
        
        
        
