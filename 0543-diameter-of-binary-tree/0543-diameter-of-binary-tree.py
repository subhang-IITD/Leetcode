# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# Aditya Verma Approach
class Solution:
    def solve(self, root, res):
        # base condition
        if root is None:
            return 0
        
        # hypothesis
        left = self.solve(root.left, res)
        right = self.solve(root.right, res)
        
        # Intuation
        temp = max(left, right) + 1
        ans = max(temp, 1 + left + right)
        res[0] = max(res[0], ans)
        
        return temp
    
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        # use the res array res[0]
        res = [float('-inf')]
        self.solve(root, res)
        return res[0] - 1