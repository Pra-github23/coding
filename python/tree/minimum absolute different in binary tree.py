# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        
        return self.mini(root, -sys.maxsize, sys.maxsize)
    
    def mini(self, root, minValue, maxValue):
        
        if root == None: return sys.maxsize
        
        mini = sys.maxsize
        
        
        mini = min(abs(root.val - minValue), abs(root.val - maxValue))
        
        mini = min(mini, self.mini(root.left, minValue, root.val))
        mini = min(mini, self.mini(root.right, root.val, maxValue))
        
        return mini
