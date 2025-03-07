class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        # low = 0 
        # high = len(matrix)*len(matrix[0])-1

        # while low <= high:
        #     mid = (low + high)//2
        #     row = mid//len(matrix[0])
        #     col = mid % len(matrix[0])
        #     if matrix[row][col] == target: return True
        #     if matrix[row][col] > target:
        #         high = mid - 1
        #     else: low = mid + 1
        
        # return False
        
        low = 0
        high = len(matrix[0])-1

        while low < len(matrix) and high >= 0:
            
            if high>= 0 and low < len(matrix) and matrix[low][high] == target: return True
            if high>= 0 and low < len(matrix) and matrix[low][high] > target:
                high = high - 1
            else: low = low + 1
        
        return False
