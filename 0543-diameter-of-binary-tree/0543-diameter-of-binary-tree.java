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
class Solution {int maxx=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // if(root==null){
        //     return 0;
        // }
    
       height(root);
          return  maxx;

        }

        private int height(TreeNode root){
            if(root==null){
                return 0;
            }
            
            int a=height(root.left);
            int b= height(root.right);
            maxx=Math.max(maxx,a+b);
            return Math.max(a,b)+1;
        }





        // if(root==null){
        //     return 0;
        // }
        // int l=height(root.left);
        // int r=height(root.right);

        // int onlyLeft=diameterOfBinaryTree( root.left);//when tree like only left side so long..
        // int onlyright=diameterOfBinaryTree( root.right);

        
        
        // return Math.max( (l+r),Math.max(onlyLeft,onlyright));}
        // private int height(TreeNode node){
        //     if(node==null){
        //         return 0;
        //     }
        //     int a=height(node.left);
        //     int b=height(node.right);

        //     return (Math.max(a,b))+1;
        

    
}