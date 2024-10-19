class Pair{
    int node;
    int dist;
    Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        
       
        
        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.dist-y.dist);
        pq.offer(new Pair(0,0));
        int v[]=new int[V];
        int sum=0;
        
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int currNode=p.node;
            int dist=p.dist;
            
            if(v[currNode] != 0)continue;
            v[currNode]=1;
            sum+=dist;
            
           
                for(int[] adjNode :adj.get(currNode)){
                     int d=adjNode[1];
                     int nextNode=adjNode[0];
                    
                     if(v[nextNode] == 0){
                        pq.offer(new Pair(nextNode,d));
                      }
               
                
                 }
            
        }
        return sum;
    }
}
