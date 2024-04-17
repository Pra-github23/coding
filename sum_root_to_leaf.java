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
   int sum=0;
   
    public int sumNumbers(TreeNode root) {

      check(root,0);
      
        return sum;
    }
    public void check(TreeNode root,int num){
        if(root==null)
        return ;
        int value=root.val+(10*num);
        System.out.println(value);
        if(root.left==null && root.right==null){
              
              System.out.println("sum:"+sum);
              sum+=value;
        }
        
        check(root.left,value);
        check(root.right,value);
         
        
    }
}