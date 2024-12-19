
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(0);
        
        ArrayList<Integer> a = new ArrayList<>();
        
        int v[] = new int[V];
        
        v[0] = 1;
        
        a.add(0);
        
        while(!q.isEmpty()){
            
            int node = q.poll();
            
            for(int nextNode : adj.get(node)){
                
                if(v[nextNode] != 1){
                    v[nextNode] = 1;
                    a.add(nextNode);
                    q.offer(nextNode);
                }
            }
        }
        
        return a;
        
    }
}
