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

 //method1 could be simply just write inorder traversal
 // and check if the inorder traversal is sorted or not 
 // method 2 is for every node we could check the range that it should lie in like root = [2,1,3] when we move to 1(left of root) it should lie between -inf and 2 and 3(right) between 2 and +inf
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validBST(TreeNode root, long minVal,long maxVal){
        if(root==null) return true;
        if(root.val >= maxVal || root.val <= minVal){
            return false;
        }

        boolean leftValid = validBST(root.left,minVal,root.val);
        boolean rightValid = validBST(root.right,root.val, maxVal);
        return leftValid && rightValid;
    }
}