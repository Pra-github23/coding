class Solution:
    #Function to sort a list using quick sort algorithm.
    def quickSort(self, arr, low, high):
        if low >= high:
            return
        
        pivot = self.partition(arr, low, high)
        
        self.quickSort(arr, low, pivot - 1)
        self.quickSort(arr, pivot + 1, high)

    def partition(self, arr, low, high):
        pivot = arr[low]  
        l = low + 1  
        h = high

        while True:
           
            while l <= high and arr[l] <= pivot:
                l += 1
            
           
            while h >= low and arr[h] > pivot:
                h -= 1

            if l < h:  
                arr[l], arr[h] = arr[h], arr[l]
            else:  
                break
        
       
        arr[low], arr[h] = arr[h], arr[low]
        
        return h 