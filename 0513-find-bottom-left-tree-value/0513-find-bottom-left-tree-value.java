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
    public int findBottomLeftValue(TreeNode root) {
       LinkedList<Integer> amit1=new LinkedList<>();
        int level=0;
        return  left(root,level,amit1);
       
    }
    public int left(TreeNode node,int level,LinkedList<Integer> amit){
        
        if(node==null){
            return 0;
        }
            if(level==amit.size()){

            amit.add(node.val);

         }

       left(node.left,level+1,amit);
        left(node.right,level+1,amit);
    //    int a=amit.size();
       return amit.getLast();
         

    }
}