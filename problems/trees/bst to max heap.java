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

class Solution
{
    public static void convertToMaxHeapUtil(Node root)
    {
       convertMaxHeap(root);
    }
    private static void convertMaxHeap(Node root){
        if(root == null)return;
        
        convertMaxHeap(root.right);
        
        if(root.right != null){
            int t = root.right.data;
            root.right.data = root.data;
            root.data = t;
        }
        
        rearrange(root.right);
        
        convertMaxHeap(root.left);
        
        
    }
    private static void rearrange(Node root){
        if(root == null)return;
        
        if(root.left != null){
            int t = root.left.data;
            root.left.data = root.data;
            root.data = t;
        }
        
        rearrange(root.left);
        
        if(root.right != null){
            int t = root.right.data;
            root.right.data = root.data;
            root.data = t;
        }
        
        rearrange(root.right);
    }
}
