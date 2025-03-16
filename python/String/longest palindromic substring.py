class Solution:
    def longestPalindrome(self, s: str) -> str:

        maxi = -sys.maxsize

        start = 0
        end = 0

        for i in range(len(s)):

            p1 = i
            p2 = i
            while p1 >= 0 and p2 < len(s) and s[p1] == s[p2]:
                p1 -= 1
                p2 += 1
            
            if maxi < p2 - p1 -1:
                maxi= p2 - p1 -1
                start = p1 +1
                end = p2
            
            p1 = i
            p2 = i+1
            while p1 >= 0 and p2 < len(s) and s[p1] == s[p2]:
                p1 -= 1
                p2 += 1
            
            if maxi < p2-p1 -1:
                maxi = p2-p1 -1 
                start = p1+1
                end = p2
        
        return s[start:end]
        
