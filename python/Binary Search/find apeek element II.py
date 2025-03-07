class Solution:
    def findPeakGrid(self, mat: List[List[int]]) -> List[int]:
        low = 0 
        high = len(mat[0])-1

        while low <= high:
            mid = (low+high)//2
            row = 0
            maxi = -1
            for i in range(len(mat)):
                if mat[i][mid] > maxi:
                    maxi = mat[i][mid]
                    row = i
            
            left = -sys.maxsize
            right = -sys.maxsize
            if mid-1 >= 0:
                left = mat[row][mid-1]
            if mid+1 < len(mat[0]):
                right = mat[row][mid+1]
            
            if left < mat[row][mid] and mat[row][mid] > right: return [row,mid]
            if left > mat[row][mid]:
                high = mid-1
            else: low = mid+1
        
        return [-1,-1]

        
