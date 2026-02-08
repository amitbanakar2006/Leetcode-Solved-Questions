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
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);

        int onlyLeft=diameterOfBinaryTree( root.left);
        int onlyright=diameterOfBinaryTree( root.right);

        
        
        return Math.max( (l+r),Math.max(onlyLeft,onlyright));}
        private int height(TreeNode node){
            if(node==null){
                return 0;
            }
            int a=height(node.left);
            int b=height(node.right);

            return (Math.max(a,b))+1;
        

    }
}