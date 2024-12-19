
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i =0; i<V; i++)
          res.add(new ArrayList<>());
         
       
       for(int i = 0; i<edges.length; i++){
     
           res.get(edges[i][0]).add(edges[i][1]);
           res.get(edges[i][1]).add(edges[i][0]);
       }
       
       return res;
    }
}
