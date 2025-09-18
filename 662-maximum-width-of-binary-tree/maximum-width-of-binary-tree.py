# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        levels = {}

        def solve(node,depth ,idx):
            if not node :
                return 
            if depth not in levels :
                levels[depth] = []
            levels[depth].append(idx)

            solve(node.left , depth + 1, 2*idx)
            solve(node.right , depth + 1, 2*idx+1)
        
        solve(root,0,0)
        max_width = 0

        for depth in levels:
            min_idx = min(levels[depth])
            max_idx = max(levels[depth])
            max_width = max(max_width , max_idx - min_idx+1)
        return max_width


            



