class Solution:
    def sumOfSeries(self,n):
        #code here
        
        sum =0
        
        for i in range(n+1):
           sum += (i**3)
            
        return sum
