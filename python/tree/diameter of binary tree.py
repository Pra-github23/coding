# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        
        dia = [-sys.maxsize]
        
        self.diameter(root, dia)
        
        if dia[0] < 0 : return 0
        
        return dia[0]
    
    def diameter(self, root, dia):
        
        if root.left is None and root.right is None: return 0
        
        leftLength = 0
        if root.left is not None:
            leftLength = self.diameter(root.left, dia)+1
        
        rightLength = 0
        if root.right is not None:
            rightLength = self.diameter(root.right, dia)+1
        
        dia[0] = max(dia[0], leftLength+rightLength)
        
        return max(leftLength, rightLength)
        
