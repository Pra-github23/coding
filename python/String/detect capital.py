class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        
        if len(word) == 1: return True
        
        
        res  = 97
        
        if word[1] <= 'Z' and word[1] >= "A":
            res = 65
        
        first = ord(word[0])
        
        if first - res > 26: return False
            
        i = 2
        
        while i < len(word):
            
            if ord(word[i])-res < 0 or ord(word[i])-res >=26 : return False
            
            i += 1
        
        return True
        
            
        
