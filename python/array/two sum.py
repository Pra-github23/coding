class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        dic ={}
        l = []

        for i in range(len(nums)):

            if dic.get(target - nums[i]) is not None:

                l.append(dic.get(target-nums[i]))
                l.append(i)
                break
            
            dic[nums[i]] = i
        
        return l
