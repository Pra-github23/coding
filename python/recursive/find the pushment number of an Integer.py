class Solution:
    def punishmentNumber(self, n: int) -> int:

        res =0
        for i in range(1,n+1):

            square = i*i
            print(str(square) ,type(str(square)))

            num = self.partition(str(square),i,0,0,len(str(square)))
            if num > 0:
                res += square
        
        return res
        
    def partition(self, arr, target, ind,summ, length):

        if ind >= length:
            if target == summ: return 1
            
            return 0
        
        original = 0
        for i in range(ind,length):
            temp = int(arr[i])
            original += temp
            
            num = self.partition(arr,target,i+1,summ+original,length)
            if(num > 0): return num

            original *= 10
        return 0
        
