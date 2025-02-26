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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root,0,result);
        return result;
    }
    private void traverse(TreeNode root,int level,List<List<Integer>> result){
        if(root==null) return; // base condition
        
        if (level>= result.size()){
            result.add(new ArrayList<>());
        }
        List<Integer> currentLevelList = result.get(level);
        currentLevelList.add(root.val);
        traverse(root.left,level+1,result);
        traverse(root.right,level+1,result);
    }
}