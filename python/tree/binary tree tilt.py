# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTilt(self, root: Optional[TreeNode]) -> int:
        
        res = [0]
        
        self.sumOfTree(root, res)
        
        return res[0]
    
    def sumOfTree(self, root, res):
        
        if root == None : return 0
        
        left  = self.sumOfTree(root.left, res)
        right = self.sumOfTree(root.right, res)
        
        res[0] = res[0] + abs(left - right)
        
        return left + right + root.val
        
