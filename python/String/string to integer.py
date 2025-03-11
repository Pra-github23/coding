class Solution:
    def myAtoi(self, s: str) -> int:
        
        i = 0

        while s[i] == ' ': i += 1
        flag = False
        while s[i] == '+': i += 1
        while s[i] == '-': 
            flag = True
            i += 1
        while s[i] == '0': i += 1

        res = []
        for c in range(i, len(s)):
            if s[c] >= '0' and s[c] <= '9':
                res.append(s[c])
            else: break
        
        if len(res) == 0: return 0
        
        
        if flag:
            
            negSign =  -1*(int)("".join(res))
            int_min = -2**31
            if negSign < int_min : return int_min
            return negSign

        int_max = 2**31 - 1

        posSign =(int)("".join(res))

        
