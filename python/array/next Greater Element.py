class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        dic = {}
        stack = []
        
        for i in range(len(nums2)-1, -1,-1):
            
            num = nums2[i]
            if len(stack) == 0:
                dic[num] = -1
               
            else:
                while len(stack) != 0 and num >= stack[len(stack)-1]:
                    stack.pop()
                
                if len(stack) == 0: 
                    dic[num] = -1
                    
                else:
                    dic[num] = stack[len(stack)-1]
                    
           
            stack.append(num)
        
        res = []
        
        for i in nums1:
            
            res.append(dic.get(i,-1))
        
        return res
          
