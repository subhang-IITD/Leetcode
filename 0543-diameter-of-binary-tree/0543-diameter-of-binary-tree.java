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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[]{Integer.MIN_VALUE}; // Mutable reference
        solve(root, result);
        return result[0]-1; // Returning diameter in terms of edges
    }

    private int solve(TreeNode root, int[] result) {
        if (root == null) return 0;

        int leftdia = solve(root.left, result);
        int rightdia = solve(root.right, result);

        int temp = 1 + Math.max(leftdia, rightdia);
        int ans = Math.max(temp,1+leftdia+rightdia); // Diameter is counted in edges (not nodes)
        result[0] = Math.max(result[0], ans); // Update global result

        return temp;
    }
}
