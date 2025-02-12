
from typing import List


class Solution:
    def largest(self, arr):
        # code here
        
        # return max(arr)
        
        maxi = -sys.maxsize -1
        
        for i in arr:
            if(i > maxi):
                maxi = i
        
        return maxi
