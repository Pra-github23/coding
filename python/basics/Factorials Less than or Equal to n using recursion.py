class Solution:
    def factorialNumbers(self, n):
    	#code here 
    	
    	return self.fact(1,2,n,[])
    
    def fact(self,i,j, n,l):
        
        if(i > n): return l
        
        l.append(i)
        
        ii = i*j
        jj = j+1
        
        return self.fact(ii, jj, n, l)
