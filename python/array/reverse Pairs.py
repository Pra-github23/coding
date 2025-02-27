class Solution:
    def reversePairs(self, nums: List[int]) -> int:
        return self.divAndCon(nums, 0, len(nums)-1)
    
    def divAndCon(self, nums, f, e):

        if f >= e:
            return 0
        count = 0
        mid = (f+e)//2

        count +=self.divAndCon(nums,f, mid)
        count +=self.divAndCon(nums, mid+1, e)
        count +=self.countPair(nums, f, mid, e)
        self.merge(nums, f, mid, e)
       

        return count
    def countPair(self, nums, f, mid, e):

        count = 0
        right = mid+1
        j= f
        for i in range(right,e+1):
           
            while j <= mid and nums[j] <= 2*nums[i]:
                j += 1
            count += right - j
            
        
        return count
    def merge(self, nums, f, mid, e):
        t = []
        tF = f
        tMid = mid+1
        

        while tF <= mid and tMid <= e:
            if nums[tF] >= nums[tMid] :                
                t.append(nums[tMid])
                tMid += 1
            else:
                t.append(nums[tF])
                tF += 1

        while tF <= mid:           
            t.append(nums[tF])
            tF += 1
        
        while tMid <= e:
            t.append(nums[tMid])
            tMid += 1
        
        for i in range(f, e+1):
            nums[i] = t[i-f]
        
        
        
