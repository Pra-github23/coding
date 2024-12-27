class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
      
    // dfs approach
    
    int v[] = new int[adj.size()];
    
    for(int i = 0; i < adj.size(); i++)
      if(v[i] == 0 && dfs(adj, v, i, -1))return true;
     
     return false;
    
    }
    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] v, int node, int parent){
        
        if(v[node] == 1)return true;
        
        v[node] = 1;
        
        for(int adjNode : adj.get(node)){
            
            if(parent == adjNode)continue;
            
            if(dfs(adj, v, adjNode, node))return true;
        }
        
        return false;
    }
}
