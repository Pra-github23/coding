class Solution:
    # @param A : list of integers
    # @param B : integer
    # @return an integer
    def solve(self, A, B):
        
        count = 0
        summ =0
        
        dic = {}
        dic[0] = 1
        
        for i in range(len(A)):
            
            summ ^= A[i]
            if summ^B in  dic:
                count += dic[summ^B]
                          
            
            dic[summ] = dic.get(summ,0)+1
            
        return count
