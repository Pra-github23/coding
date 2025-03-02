class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        low = min(bloomDay)
        high = max(bloomDay)
        temp = high
        while low <= high:
            mid = (low+high)//2
            boo = self.makeBouquet(bloomDay, m, k, mid)
            if boo:
                high = mid-1
            else:
                low = mid+1
        if low > temp : return -1
        return low

    def makeBouquet(self, bloomDay, m, k, mid):
        count = 0
        total = 0
        for i in  bloomDay:
            if i <= mid:
                count += 1
            else :
                total += count//k
                count = 0
        
        total += count//k
        
        return total >= m

        
