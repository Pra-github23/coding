class Solution:
    def factorialNumbers(self, n):
    	#code here 
    	a =[]
    	i = 1
    	inc = 1
    	
    	while i <= n:
    	    a.append(i)
    	    if i > n: break
    	    inc += 1
    	    i *= inc
    
    	return a
