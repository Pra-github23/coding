
class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        
        return c(root);  //  O(n^2)
        // return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);  O(n)
    }
    
    private boolean c(Node root){
        if(root == null)return true;
        
        boolean left = isGreater(root.left, root.data);
        boolean right = isLower(root.right, root.data);
        
        if(!left  || !right)return false;
        
        return c(root.left) && c(root.right);
    }
    
    private boolean isGreater(Node root, int data){
        if(root == null)return true;
        
        if(root.data >= data)return false;
        
        return isGreater(root.left, data) && isGreater(root.right, data);
    }
    
    private boolean isLower(Node root, int data){
        if(root == null)return true;
        
        if(root.data <= data)return false;
        
        return isLower(root.left, data) && isLower(root.right, data);
    }
    
    private boolean check(Node root, int min, int max){
        if(root == null)return true;
        
        if(min >= root.data || root.data >= max)return false;
        
        return check(root.left, min, root.data) && check(root.right, root.data, max);
    }
}
