class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num == 1 : return False
        summ = 1
        ind = 2
        while ind*ind <= num:
            
            if num % ind == 0:
                summ += ind + num// ind
            if summ > num: return False
            ind += 1
        
        return summ == num
        
