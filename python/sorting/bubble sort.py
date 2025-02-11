class Solution:
    #Function to sort the array using bubble sort algorithm.
    def bubbleSort(self,arr):
        # code here
        for i in range(len(arr)):
            
            for j in range(1,len(arr)-i):
                
                if arr[j-1] > arr[j]:
                    
                    temp = arr[j-1]
                    arr[j-1] = arr[j]
                    arr[j] = temp
        
        return arr
