class Solution:
    def sumOfSeries(self,n):
        #code here
        
        if(n == 0): return 0
        
        return self.sumOfSeries(n-1)+ n**3
