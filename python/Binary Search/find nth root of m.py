class Solution:
	def nthRoot(self, n: int, m: int) -> int:
		# Code here
		if m == 1: return 1
		if n == 1: return m
		
		low = 1
		high = m//2
		
		while low <= high:
		    mid = (low+high)//2
		    
		    if mid**n == m: return mid
		    
		    if mid**n > m: high = mid-1
		    else: low = mid+1
		
		return -1
