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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth <= 1){
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            return temp;
        }
       addRow(root,val,depth-1);
       return root;
    }
    private void addRow(TreeNode root,int val,int depth){
        if(root == null)return;
        if(depth==1){
            if(root.left != null || root.left == null){
                TreeNode node=new TreeNode(val);
                TreeNode temp=root.left;
                root.left=node;
                node.left=temp;
            }
            if(root.right != null || root.right == null){
                TreeNode node=new TreeNode(val);
                TreeNode temp=root.right;
                root.right=node;
                node.right=temp;
            }
           return;
        }
        addRow(root.left,val,depth-1);
        addRow(root.right,val,depth-1);
    }
}