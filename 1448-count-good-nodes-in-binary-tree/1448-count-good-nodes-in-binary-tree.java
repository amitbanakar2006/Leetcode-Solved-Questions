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
    int count =0;
    public int goodNodes(TreeNode root) {
        int a=check(root.val,root);
        return a;
        
    }
    private int check(int k,TreeNode node){
        if(node==null){
            return count;
        }
        if(k<=node.val){
            count++;
            k=node.val;
        }
        check(k,node.left);
        check(k,node.right);
        return count;
    }
}