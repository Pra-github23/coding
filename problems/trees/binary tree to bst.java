/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


class Solution
{
    ArrayList<Integer> a = new ArrayList<>();
    int ind = 0;
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
       
       store(root);
       Collections.sort(a);
       
       arrange(a,root);
       
       return root;
    }
    private void arrange(ArrayList<Integer> a, Node root){
        if(root == null)return ;
        
        
        arrange(a, root.left);
        
        root.data = a.get(ind);
        ind++;
        
        arrange(a, root.right);
        
      
    }
    private void store(Node root){
        if(root == null)return;
        
        store(root.left);
        a.add(root.data);
        store(root.right);
    }
}
