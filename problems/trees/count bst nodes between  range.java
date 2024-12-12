class Solution {
    // Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root, int l, int h) {
      
      
      return count(root, l, h);
      
    }
    private int count(Node root, int l, int h){
        if(root == null)return 0;
        
        if(l > root.data || root.data > h)return count(root.left, l, h) + count(root.right, l, h);
        
        return 1 + count(root.left, l, h) + count(root.right, l, h);
    }
}
