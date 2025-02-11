class Solution:
    def insertionSort(self, arr):
        #code here
        
        for i in range(len(arr)):
            
            for j in range(i):
                
                if(arr[j] > arr[i]):
                    temp = arr[j]
                    arr[j]= arr[i]
                    arr[i] = temp
        return arr
