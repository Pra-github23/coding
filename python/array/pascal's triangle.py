class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        l = [[1]]

        for i in range(1,numRows):
            row = [1]
           
            for j in range(1,i):
                num = l[i-1][j-1]+l[i-1][j]
                row.append(num)
            
            row.append(1)
            l.append(row)
        
        return l
                




        
