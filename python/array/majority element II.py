class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:

        div = len(nums)//3

        dic = {}
        res = []
        for i in nums:
            dic[i] = dic.get(i,0)+1

            if dic.get(i) > div and i not in res:
                res.append(i)

        return res
