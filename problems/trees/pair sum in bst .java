class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target)
    {
     Map<Integer,Integer> map = new HashMap<>();
     Queue<Node> q = new LinkedList<>();
     q.offer(root);
     while(!q.isEmpty()){
         int size = q.size();
         while(size-- > 0){
             Node n = q.poll();
             if(map.containsKey(target - n.data))return 1;
             map.put(n.data, map.getOrDefault(n.data, 0)+1);
             if(n.left != null)q.offer(n.left);
             if(n.right != null)q.offer(n.right);
         }
     }
     return 0;
    }
}
