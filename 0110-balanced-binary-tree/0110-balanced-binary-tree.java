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
class Solution {//balanced means hight of left-right <=1
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
       int a=height(root.left);
       int b=height(root.right);
       int res=Math.abs(a-b);
       return res<=1&&isBalanced( root.left)&&isBalanced( root.right);

    }
    private int height(TreeNode root1){
        if(root1==null){
            return 0;
        }
        int l=height(root1.left);
        int r=height(root1.right);
       
        return (Math.max(l,r)+1);
    }
}