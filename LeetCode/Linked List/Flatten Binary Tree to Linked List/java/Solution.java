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
    public void flatten(TreeNode root) {
        TreeNode c = root ;
        while(c!=null){
            if(c.left!=null){
            TreeNode t = c.left;
            while(t.right!=null){
                t = t.right;
            }
                t.right = c.right;
                c.right = c.left;
                c.left = null;
            }
            c = c.right;
        }
    }
}