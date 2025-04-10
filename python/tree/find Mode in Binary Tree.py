# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        
        dic = {}
        maxi = [0]
                
        self.mode(root, dic, maxi)
        
        res = []
        
        for k,v in dic.items():
            if maxi[0] == v:
                res.append(k)
        
        return res
            
            
    
    def mode(self, root, dic, maxi):
        if root == None : return
        
        dic[root.val] = dic.get(root.val, 0) + 1
        
        maxi[0] = max(maxi[0], dic[root.val])
        
        self.mode(root.left, dic, maxi)
        self.mode(root.right, dic, maxi)
        
        
        
