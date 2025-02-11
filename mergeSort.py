
class Solution:
 
    def mergeSort(self,arr, l, r):
        #code here
        
        if(l >= r): return
        
        mid = (l + r)//2
        
        self.mergeSort(arr,l,mid)
        self.mergeSort(arr,mid+1,r)
        
        self.merge(arr,l,mid,r)
        
    def merge(self,arr, l, mid, r):
        
        newArr = []
        
        i =l
        j =mid+1
        
        while(i <= mid and j<= r):
            
            if(arr[i] < arr[j]):
                
                newArr.append(arr[i])
                i += 1
            else:
                newArr.append(arr[j])
                j += 1
        
        while(i <= mid):
            newArr.append(arr[i])
            i += 1
        
        while(j <= r):
            newArr.append(arr[j])
            j += 1
        
        for k in range(len(newArr)):
            arr[k+l] = newArr[k]
        
        return
        
        