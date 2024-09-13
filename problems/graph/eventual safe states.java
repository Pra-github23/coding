class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
          
      
       int v[]=new int[V];
       int outDegree[]=new int[V];
       List<List<Integer>> rev=new ArrayList<>();
       
       for(int i=0;i<V;i++)
       rev.add(new ArrayList<>());
      
      for(int i=0;i<V;i++){
          
          for(int sub :adj.get(i)){
           outDegree[i]++;
           rev.get(sub).add(i);
          }
        // System.out.println(outDegree[i]);
      }
      
      Queue<Integer> q=new LinkedList<>();
      List<Integer> list=new ArrayList<>();
      
      for(int i=0;i<V;i++)
      if(outDegree[i]==0){
       q.offer(i);
      
      }
      
      
      while(!q.isEmpty()){
          int index=q.poll();
          list.add(index);
          for(int sub : rev.get(index)){
              outDegree[sub]--;
              if(outDegree[sub]==0){
                  q.offer(sub);
                  
              }
          }
      }
      Collections.sort(list);
      return list;
      
    }
}
