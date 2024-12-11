class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    ArrayList<Integer> a = new ArrayList<>();

    public ArrayList<Integer> Ancestors(Node root, int target) {
        ancestors(root, target);
        return a;
    }
    private boolean ancestors(Node root, int t){
        if(root == null)return false;
        
        if(root.data == t)return true;
        
         if( ancestors(root.left, t) || ancestors(root.right, t)){
             a.add(root.data);
             return true;
         }
         return false;
    }
}
