class Solution
{
    public static int maxPathSum(Node root)
    {
        return sum(root);
    }
   static  private int sum(Node root){
        if(root.left == null && root.right == null)return root.data;
        
        int left  = Integer.MIN_VALUE;
        
        if(root.left != null)
            left = sum(root.left);
            
        int right = Integer.MIN_VALUE;
        
        if(root.right != null)
            right = sum(root.right);
         
        
        return Math.max(left, right) + root.data;
    }
}
