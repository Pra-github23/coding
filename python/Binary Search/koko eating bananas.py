class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        
        high = max(piles)
        low = 1
        
        while low <= high:
            mid = (low+high)//2
            boo = self.eat(piles, mid, h)
            if boo:
                high = mid -1
            else:
                low = mid+1
        
        return low
    
    def eat(self, piles, mid, h):

        count = 0
        for i in piles:
            count += i//mid
            if i%mid > 0:
                count += 1
        
        if count <= h: return True
        return False


        
