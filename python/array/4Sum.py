class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:

        res = []
        nums.sort()

        for i in range(len(nums)-3):

            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            for j in range(i+1, len(nums)-2):

                if j != i+1 and nums[j] == nums[j-1]:
                    continue
                
                left = j+1
                right = len(nums)-1
                while left < right:

                    summ = nums[i]+nums[j]+nums[left]+nums[right]
                    if summ == target:
                        print(summ)

                        res.append([nums[i],nums[j],nums[left],nums[right]])

                        while left + 1 < right and nums[left] == nums[left+1]:
                            left += 1
                        left += 1

                        while right - 1 > left and nums[right] == nums[right-1]:
                            right -= 1
                        right -= 1
                    
                    elif summ > target:
                        right -= 1
                    else:
                        left += 1
        
        return res



        
