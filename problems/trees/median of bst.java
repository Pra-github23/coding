class Tree
{
     
    public static float findMedian(Node root)
    {
         ArrayList<Float> a = new ArrayList<>();
  
       
       arrange(root, a);
       
       int ind = a.size()/2;
       if(a.size() % 2 == 1)return a.get(ind);
       
       
       return (a.get(ind) + a.get(ind-1))/2;
       
    }
    private static void arrange(Node root, ArrayList<Float> a){
        if(root == null)return ;
        
        arrange(root.left, a);
        a.add((float)root.data);
        arrange(root.right, a);
    }
}
