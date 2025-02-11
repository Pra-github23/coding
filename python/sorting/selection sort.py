class Solution: 
    def selectionSort(self, arr):
        #code here
        for i in range(0,len(arr)):
            
            ind = i
            
            for j in range(i+1, len(arr)):
                
                if arr[ind] > arr[j]:
                    ind = j
            
            temp = arr[i]
            arr[i] =arr[ind]
            arr[ind] = temp
    
        return arr
