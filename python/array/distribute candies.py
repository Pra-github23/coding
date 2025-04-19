class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        
        dic = {}
        div = len(candyType) // 2
        
        
        for i  in range(len(candyType)):
            
            dic[candyType[i]] = dic.get(candyType[i], 0) + 1
            
            if div == len(dic): break
        
        return len(dic)
            
            
        
