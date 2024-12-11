/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    Node removekeys(Node root, int l, int r) {
        
        return range(root, l, r);
        
    }
    private Node range(Node root, int l, int r){
        if(root == null) return null;
        
        if(root.data < l) return range(root.right,l, r);
        if(root.data > r) return range(root.left, l, r);
        
        root.left  = range(root.left, l, r);
        root.right = range(root.right, l, r);
        
        return root;
    }
}
