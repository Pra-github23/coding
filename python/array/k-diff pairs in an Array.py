class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        count = 0
        
        dic = {}
        se = set()
        
        for i in nums:
            
                       
            if dic.get(i+k) != None or dic.get(i-k) != None:
                
                if dic.get(i+k) != None and dic.get(i-k) != None:
                    m1 = min(i+k, i)
                    m2 = max(i+k, i)
                    n1 = min(i-k, i)
                    n2 = max(i-k, i)
                    se.add((m1,m2))
                    se.add((n1,n2))
                
                elif dic.get(i+k) != None:
                    mini = min(i+k, i)
                    maxi = max(i+k, i)
                    se.add((mini, maxi))
                else:
                    mini = min(i-k, i)
                    maxi = max(i-k, i)
                    se.add((mini, maxi))
                                  
            dic[i] = i
        
        return len(se)
