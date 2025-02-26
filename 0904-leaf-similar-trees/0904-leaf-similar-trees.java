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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        getLeafSeq(root1,leaves1);
        getLeafSeq(root2,leaves2);

        return leaves1.equals(leaves2);
    }

    private void getLeafSeq(TreeNode root, List<Integer> leaves){
        if(root==null){
            return;
        }
        if(root.left == null && root.right == null){
            leaves.add(root.val);
        }
        getLeafSeq(root.left,leaves);
        getLeafSeq(root.right,leaves);
    }
}