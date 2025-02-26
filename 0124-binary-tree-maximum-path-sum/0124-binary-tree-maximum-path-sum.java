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
    public int maxPathSum(TreeNode root) {
       int[] result = new int[]{Integer.MIN_VALUE};
       solve(root,result);
       return result[0]; 
    }

    private int solve(TreeNode root, int[] result){
        if(root==null) return 0;
        int l = solve(root.left,result);
        int r = solve(root.right,result);

        int temp = Math.max(Math.max(l,r)+root.val,root.val);
        int ans = Math.max(temp,l+r+root.val);
        result[0] = Math.max(result[0], ans);
        return temp;
    }
}