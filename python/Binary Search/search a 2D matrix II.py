class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
         
        low = 0
        high = len(matrix[0])-1

        while low < len(matrix) and high >= 0:
            
            if high>= 0 and low < len(matrix) and matrix[low][high] == target: return True
            if high>= 0 and low < len(matrix) and matrix[low][high] > target:
                high = high - 1
            else: low = low + 1
        
        return False
        
