class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        mini = min(strs , key= len)
        count = 0
        for i in range(len(mini)):

            boo = self.check(strs, i)
            if boo:
                count += 1
            else : break
        
        return strs[0][0: count]
    
    def check(self, strs, ind):

        ch = strs[0][ind]

        for i in range(1,len(strs)):
            if strs[i][ind] != ch : return False
        
        return True


        
