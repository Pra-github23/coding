class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        dic = {}
        for i in range(len(s)):

            if dic.get(s[i], 0) != 0 and dic.get(s[i]) != t[i]:
                return False
            elif t[i] in dic.values() and dic.get(s[i],0) != t[i]: return False
           
            dic[s[i]] = t[i]
            
        
        return True

        
