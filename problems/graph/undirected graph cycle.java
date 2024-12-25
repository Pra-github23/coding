
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v[] = new int[adj.size()];
        
        for(int i =0 ; i < v.length; i++)
        
        if(v[i] == 0 && cycle(adj, i, v))return true;
        
        return false;
    }
    private boolean cycle(ArrayList<ArrayList<Integer>> adj, int i, int[] v){
        
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(i, -1));
        
      
        
        while(!q.isEmpty()){
            
            Pair p = q.poll();
            
            int node = p.node;
            int parent = p.parent;
            
            if(v[node] == 1)return true;
            v[node] = 1;
            
            for(int nextNode : adj.get(node)){
                
                if(nextNode != parent){
                   
                    if(v[nextNode] != 0)return true;
                   
                     q.offer(new Pair(nextNode, node));
                     
                }
            }
            
        }
        return false;
    }
}
class Pair{
    int node;
    int parent;
    Pair(int node, int parent){
        this.node = node;
        this.parent = parent;
    }
