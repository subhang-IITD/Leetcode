/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return solve(root);
    }
    private int solve(TreeNode root){
        if(root == null) return 0;
        int leftHeight = solve(root.left);
        int rightHeight = solve(root.right);
        int ans = 1 + Math.max(leftHeight,rightHeight);
        return ans;
    }
}