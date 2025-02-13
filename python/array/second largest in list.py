class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        
        sec = -1
        first = sec
        
        for i in arr:
            
            if first < i:
                sec = first
                first = i
            elif first > i and i > sec:
                sec = i
                
        
        return sec

