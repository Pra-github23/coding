class Solution:
    def findLHS(self, nums: List[int]) -> int:
        
        maxi = 0
        
        dic = {}
        
        for i in nums:
            dic[i] = dic.get(i, 0)+1
            
            if dic.get(i-1,-1) != -1:
                maxi = max(maxi, dic.get(i)+dic.get(i-1,0))
            if dic.get(i+1,-1) != -1:
                maxi = max(maxi, dic.get(i)+dic.get(i+1,0))
        
        return maxi
            
            
        
