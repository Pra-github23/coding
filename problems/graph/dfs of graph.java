class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        
        dfs(adj, 0);
        
        return a;
    }
    private void dfs(ArrayList<ArrayList<Integer>> adj, int node){
        
        if(!a.contains(node))a.add(node);
        else return;
        
        for(int nextNode : adj.get(node)){
            dfs(adj, nextNode);
        }
    }
}
