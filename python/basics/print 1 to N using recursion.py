class Solution:    
    #Complete this function
    def printNos(self,n):
        #Your code here
        
        if n == 0: return self
        
        self.printNos(n-1)
        print(n, end=" ")
        return self
