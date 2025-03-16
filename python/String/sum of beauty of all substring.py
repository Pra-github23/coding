class Solution:
    def beautySum(self, s: str) -> int:

        count = 0
        
        for i in range(len(s)):
            dic ={}
            
            for j in range(i, len(s)):
                dic[s[j]] = dic.get(s[j], 0)+1
                maxi = self.freqt(dic, True)
                mini = self.freqt(dic, False)
                count += maxi - mini
        
        return count
    def freqt(self,dic,boo):
        mini = sys.maxsize
        maxi = -sys.maxsize

        for k,v in dic.items():
            if boo:
                maxi = max(maxi, v)
            else:
                mini = min(mini, v)
        
        if boo: return maxi
        return mini

        

                
        
