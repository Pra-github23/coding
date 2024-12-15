class Solution {
    
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        TreeSet<Integer> a = new TreeSet<>();
        store(root, a);
        
        if(a.ceiling(key+1) != null)suc[0] = new Node(a.ceiling(key+1));  // a.higher(key)  > key    otherwise null
        else suc[0] = new Node(-1);
        
        if(a.floor(key-1) != null)pre[0] = new Node(a.floor(key-1));    //a.lower(key) < key    otherwise null
        else pre[0] = new Node(-1);
    }
    private static void store(Node root, TreeSet<Integer> a){
        if(root == null)return;
        
        store(root.left, a);
        
        a.add(root.data);
        
        store(root.right, a);
    }
}
