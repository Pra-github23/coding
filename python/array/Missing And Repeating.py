class Solution:
    def findTwoElement( self,arr): 
        # code here
        res = []
        i  = 0 
        duplicate = -1
        missing = -1
        
        while i < len(arr):
            
            if i+1 != arr[i]:
                num = arr[i]
                
                if arr[num-1] == num:
                    duplicate = num
                    missing = i+1
                    i += 1
                else:
                    arr[num-1], arr[i] = arr[i], arr[num-1]
            else : 
                i += 1
        
        res.append(duplicate)
        res.append(missing)
        return res  
