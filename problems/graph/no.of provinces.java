
class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int i =0; i<adj.size(); i++)
         res.add(new ArrayList<>());
         
        for(int i = 0; i < adj.size(); i++){
            for(int j = 0; j < adj.size(); j++){
                
                if(adj.get(i).get(j) == 1) res.get(i).add(j);
            }
        }
         
        int v[] = new int[V];
        int c =0;
        
        for(int i =0; i<V; i++){
            if(v[i] != 1){
                // System.out.println("yes");
                c++;
                bfs(v, res, i);
            }
        }
        return c;
    }
    private static void bfs(int v[], ArrayList<ArrayList<Integer>> adj, int i){
        
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(i);
        
        while(!q.isEmpty()){
            int node = q.poll();
            
            for(int next : adj.get(node)){
                if(v[next] == 0){
                    v[next] =1;
                    q.offer(next);
                }
            }
        }
        return;
    }
};
