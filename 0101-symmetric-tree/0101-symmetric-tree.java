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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true ;
        }

    
    return mirror(root.left,root.right);}
    private Boolean mirror(TreeNode Node1,TreeNode Node2){
        if(Node1==null && Node2==null){
            return true;
        }
        if(Node1==null || Node2==null){
            return false;
        }
        
        return (Node1.val==Node2.val)&&(mirror(Node1.left,Node2.right))&&(mirror(Node1.right,Node2.left));


    }
}