class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        
        res = []
        x = 0
        y = 0
        
        ele = len(mat) * len(mat[0])
        
        if ele != r * c:
        
            return mat
        
        for i in range(r):
            temp = []
           
            for j in range(c):
                temp.append(mat[x][y])
              
                if y + 1 == len(mat[0]):
                    x = x + 1
                    x = x % len(mat)
                y += 1
                y = y % len(mat[0])
            res.append(temp)
            
           
        
        return res
        
