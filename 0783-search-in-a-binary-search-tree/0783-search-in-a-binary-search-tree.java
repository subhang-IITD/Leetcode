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
    public TreeNode searchBST(TreeNode root, int key) {
        TreeNode current = root; // Start from root
        
        while (current != null) {
            if (current.val == key) return current; // Return the subtree rooted at current node
            if (key < current.val) current = current.left; // Move left
            else current = current.right; // Move right
        }
        
        return null; // Key not found
    }
}
