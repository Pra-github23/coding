class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        dim = []

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):

                if matrix[i][j] == 0:
                    dim.append(i)
                    dim.append(j)
        
        for i in range(0,len(dim),2):

            j = i+1

            self.setZero(matrix,dim[i],dim[j])
    
    def setZero(self, matrix, row, col):

        for i in range(len(matrix[0])):
            matrix[row][i] = 0
        
        for j in range(len(matrix)):
            matrix[j][col] = 0


        
