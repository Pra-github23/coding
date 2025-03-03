class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:

        high = sum(weights)
       
        low = max(weights)
        
        while low <= high:

            mid = (low+high)//2

            boo = self.isCapacity(weights, mid, days)

            if boo:
                high = mid-1
            else:
                low = mid+1
        
        return low
    
    def isCapacity(self, weights, mid, days):

        count = 1
        summ  = 0
        
        for i in range(len(weights)):
            if summ + weights[i] <= mid:
                summ += weights[i]
            else:
                count += 1
                summ = weights[i]
        
      
        if count <= days: return True
        return False

        
