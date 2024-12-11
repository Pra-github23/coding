class GfG {
    int findDist(Node root, int a, int b) {
               
        return dist(root, a, b, 0);
    }
    private int dist(Node root, int a, int b, int level){
        if(root == null)return 0;
        
        int t = -1;
        if(root.data == a && root.data == b)return 0;
        
        if(root.data == a || root.data == b)t = level;
        
        int left = dist(root.left, a, b, level+1);
        int right = dist(root.right, a, b, level+1);
        
        if(left > 0 && right > 0)return right + left - 2*level;
        if(t >= 0 && left > 0) return left - t;
        if(t >= 0 && right > 0)return right - t;
        
        if(left > 0 || right > 0)return left + right;
        return t != -1 ? t : 0;
    }
}
