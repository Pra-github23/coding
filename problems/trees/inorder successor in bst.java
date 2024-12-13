class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
       successor(root);
       
       int low = 0;
       int high = a.size()-1;
       
   
       
       while(low  <= high){
           int mid = (low+high)/2;
           if(a.get(mid) == x.data){
               if(a.size() == mid+1)return -1;
               return a.get(mid+1);
           }
           if(a.get(mid) > x.data){
          
               high = mid -1;
           }
           else low = mid + 1;
       }
       return -1;
       
    }
    private void successor(Node root){
        if(root == null)return;
        
        successor(root.left);
        
        a.add(root.data);
        
        successor(root.right);
    }
}
