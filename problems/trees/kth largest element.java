class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    int t;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
       
       t = k;
       insert(root);
       return a.get(k-1);
    }
    private void insert(Node root){
        if(root == null)return;
        
        insert(root.right);
        
        a.add(root.data);
        if(t == a.size())return;
        
        insert(root.left);
        
    }
}
