class Pair{
    int group;
    int row;
    
    Pair(int row,int group){
        this.row=row;
      
        this.group=group;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        int []v=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(graph[i].length == 0)continue;
            if(v[i]==0){
                if(!bfs(graph,v,i,1)) return false;
            }
        }
        return true;
    }
    private boolean bfs(int[][] g, int[] v, int r,int gr){
       Queue<Pair> q=new LinkedList<>();
       q.offer(new Pair(r,gr));
        v[r]=gr;

       while(!q.isEmpty()){
        Pair p=q.poll();
        int row=p.row;
        int group=p.group;
       
        for(int curNode: g[row]){
            if(v[curNode]==0){

                if(group==1){
                    v[curNode]=2;
                    q.offer( new Pair(curNode,2));
                }
                else{
                    v[curNode]=1;
                    q.offer(new Pair(curNode,1));
                }
            }
            else if(v[curNode] == group)
              return false;
        }
       }
       return true;
    }
}
