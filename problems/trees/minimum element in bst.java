class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        
        return mini(root);
        // return min(root);
    }
    private int min(Node root){
        if(root == null)return Integer.MAX_VALUE;
        
        if(root.left != null)return Math.min(min(root.left) , root.data);
        
        return  root.data;
        
    }
    
    private int mini(Node root){
        if(root.left == null && root.right == null)return root.data;
        
        if(root.left != null)return mini(root.left);
        
        return root.data;
    }
}
