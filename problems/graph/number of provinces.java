class Solution {

    public int findCircleNum(int[][] isConnected) {
       List<List<Integer>> res = new ArrayList<>();

       for(int i =0; i< isConnected.length; i++)
        res.add(new ArrayList<>());
       
       for(int i=0; i< isConnected.length; i++){
        for(int j= 0; j< isConnected.length; j++){

            if(isConnected[i][j] == 1){

                res.get(i).add(j);
                res.get(j).add(i);
            }
        }
       }

       int v[] = new int[isConnected.length];
        
        int count =0;
       for(int i =0; i< v.length; i++){
         if(v[i] != 1){
            count++;
            bfs(v, res, i);
         }
       }
       return count;
    }
    private void bfs(int []v, List<List<Integer>> res, int i){
        Queue<Integer> q = new LinkedList<>();

        q.offer(i);

        while(!q.isEmpty()){
           int node = q.poll();
           
            for(int next : res.get(node)){
                if(v[next] != 1){
                    v[next] =1;
                    q.offer(next);
                }
            }
        }
        return;
    }
}
