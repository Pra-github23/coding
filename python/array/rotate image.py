class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        for i in range(len(matrix)):
            for j in range(i,len(matrix)):

                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        
        i = 0
        j = len(matrix)-1

        while i < j:
            for k in range(len(matrix)):
                matrix[k][i],matrix[k][j] = matrix[k][j],matrix[k][i]
            
            i  += 1
            j  -= 1
        
