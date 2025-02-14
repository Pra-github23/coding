class Solution:
    
    #Function to return a list containing the union of the two arrays.
    def findUnion(self,a,b):
        # code here 
        
        res = []
        
        i = 0
        j = 0
        ii = len(a)
        jj = len(b)
        prev = -1
        
        if a[i] < b[j]:
            res.append(a[i])
            prev = a[i]
            i += 1
        else:
            res.append(b[j])
            prev = b[j]
            j += 1
        
        
        while i < ii and j < jj :
            
            while i < ii and prev == a[i]: i += 1
            while j < jj and prev == b[j]: j += 1
            
            if(i == ii or j == jj): break
        
            if a[i] == b[j]:
                res.append(a[i])
                prev = a[i]
                i += 1
                j += 1
                
            elif a[i] < b[j]:
                res.append(a[i])
                prev = a[i]
                i += 1
            else:
                res.append(b[j])
                prev = b[j]
                j += 1
        
        while i < ii:
            while i < ii and prev == a[i]: i += 1
            if i < ii:
                res.append(a[i]) 
                prev = a[i]
                i += 1
        
        while j < jj:
            while j < jj and prev == b[j]: j += 1
            if j < jj:
                res.append(b[j])
                prev = b[j]
                j += 1
        
        return res
