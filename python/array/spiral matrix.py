class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        res = []

        top = 0
        bottom = len(matrix) - 1
        left  = 0
        right = len(matrix[0]) - 1

        while top <= bottom and left <= right:
             
            # left to right
            for i in range(left, right+1):
                
                res.append(matrix[top][i])
            top += 1
            
            # top to bottom
            for i in range(top, bottom+1):

                res.append(matrix[i][right])
            right -= 1
            
            # if the cross top and bottom or left and right, break it
            if top > bottom or left > right: break

            # right to left
            for i in range(right, left - 1, -1):

                res.append(matrix[bottom][i])
            bottom -= 1

            # bottom to top
            for i in range(bottom, top - 1, -1):

                res.append(matrix[i][left])
            left += 1
    

        return res     


        
