/*
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

    public boolean isSubtree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val==q.val){
            Boolean a=is_same(p.right,q.right);
            Boolean b=is_same(p.left,q.left);
            if(a&&b){
                return true;
            }
        }
        
            return (isSubtree(p.right,q)||isSubtree( p.left, q));


        
    }
    private Boolean is_same(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null){
            return true;
        }
        if(node1==null||node2==null){
            return false;
        }
        return (node1.val==node2.val)&&is_same(node1.right, node2.right)&&is_same(node1.left, node2.left);
    }
}