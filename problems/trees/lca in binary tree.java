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
}*/

class Solution {
    // Function to return the lowest common ancestor in a Binary Tree.
    Node lca(Node root, int n1, int n2) {
       
       return common(root, n1, n2);
    }
    private Node common(Node root, int n, int m){
        if(root == null)return null;
        
        if(root.data == n || root.data == m)return root;
        
        Node left  = common(root.left, n, m);
        Node right = common(root.right, n, m);
        
        if(left != null && right != null)return root;
        
        if(left != null) return left;
        
        return right;
    }
}
