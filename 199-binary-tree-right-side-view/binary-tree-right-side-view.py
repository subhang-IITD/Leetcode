# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        
        ans = []
        def solve(level , ans , root):
            if not root :
                return 
            
            if len(ans) == level:
                ans.append(root.val)
            
            solve(level+1,ans , root.right)
            solve(level+1 , ans , root.left)
        solve(0,ans,root)
        return ans
        