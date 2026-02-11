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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> amit1=new ArrayList<>();
     int level=0;
     return view(root,level,amit1);
    }
    public List<Integer> view(TreeNode node,int level,ArrayList<Integer> amit){
            // =new ArrayList<>();
        if(node ==null){
            return amit;
        }
        if(level==amit.size())
            {     amit.add(node.val);
            }
        view(node.right,level+1,amit);
        view(node.left,level+1,amit);
        return amit;

    }   
}