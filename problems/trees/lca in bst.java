class BST {
    // Function to find the lowest common ancestor in a BST.
    Node LCA(Node root, int n1, int n2) {
        // code here.
        
        return lowestCommon(root, n1, n2);
    }
    private Node lowestCommon(Node root, int n, int m){
        if(root == null)return null;
        
        Node temp = null;
        if(root.data == n || root.data == m)temp = root;
        
        Node left  = lowestCommon(root.left, n, m);
        Node right = lowestCommon(root.right, n, m);
        
        if(left != null && right != null)return root;
        if(temp != null && (left != null || right != null))return root;
        
        if(left != null)return left;
        if(right != null)return right;
        return temp;
    }
}
