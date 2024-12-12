
/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */
class Solution
{
    public static void transformTree (Node root)
    {
        transform(root, 0);
    }
    static private int transform(Node root, int sum){
        if(root == null)return sum;
        
        int right = transform(root.right, sum);
        
        sum = right + root.data;
        root.data = right;
        
        return transform(root.left, sum);
        
        
    }
}
