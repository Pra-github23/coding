
class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {


        // disjoint approach
        
        int p[] = new int[V];
        int l[] = new int[V];
        
        for(int i =0; i < V; i++){
            p[i] = i;
            
        }
        
        for(int i =0; i< V; i++){
            for(int j =0; j < V; j++){
                if(i != j && adj.get(i).get(j) == 1){
                    
                    union(p,l, i, j);
                }
            }
        }
        int c = 0;
        for(int i =0; i< V; i++)
        if(p[i] == i)c++;
        
        // bfs approach
        
        // ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        // for(int i =0; i<adj.size(); i++)
        //  res.add(new ArrayList<>());
         
        // for(int i = 0; i < adj.size(); i++){
        //     for(int j = 0; j < adj.size(); j++){
                
        //         if(adj.get(i).get(j) == 1) res.get(i).add(j);
        //     }
        // }
         
        // int v[] = new int[V];
        // int c =0;
        
        // for(int i =0; i<V; i++){
        //     if(v[i] != 1){
        //         // System.out.println("yes");
        //         c++;
        //         bfs(v, res, i);
        //     }
        // }
        return c;
    }
    private static int parent(int[]p ,int ind){
        if(p[ind] == ind)return ind;
        
        return p[ind] = parent(p, p[ind]);
    }
    
    private static void union(int[] p, int[] l, int s, int d){
        int pS = parent(p, s);
        int pD = parent(p, d);
        
        if(pS != pD){
            if(l[pS] > l[pD]){
                p[pD] = pS;
            }
            else if(l[pS] < l[pD]){
                p[pS] = pD;
            }
            else{
                p[pD] = pS;
                l[pS]++;
            }
        }
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
