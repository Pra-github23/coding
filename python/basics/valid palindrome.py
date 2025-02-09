class Solution:
    def isPalindrome(self, s: str) -> bool:

        
        a = []

        for ch in s:
            ch1 = ch.upper()
            if((ch1 >= 'A' and ch1 <= 'Z') or (ch1 >= '0' and ch1 <= '9')):
                a.append(ch1)
        
        i = 0
        j = len(a) -1

        while (i < j):

            if(a[i] != a[j]): return False
            i += 1
            j -= 1
       
        return True

        
