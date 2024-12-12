class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        
        return add(root, Key);
    }
    private Node add(Node root, int key){
        if(root == null)return new Node(key);
        
        if(root.data == key)return root;
        
        if(root.left != null && root.data > key)root.left = add(root.left, key);
        else if(root.right != null && root.data < key) root.right = add(root.right, key);
        else{
            if(root.data > key) root.left = new Node(key);
            else root.right = new Node(key);
        }
        
        return root;
    }
}
