/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node root) {
       
       return sum(root) == (root.data * 2);
    }
    private int sum(Node root){
        if(root == null)return 0;
        
        int left = sum(root.left);
        int right = sum(root.right);
        
        if(root.left == null && root.right == null)return root.data;
        
        if(left + right == root.data)return left + right + root.data;
        
        return Integer.MIN_VALUE;
    }
}
