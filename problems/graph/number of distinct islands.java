class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int [][]v=new int[grid.length][grid[0].length];
        Set<List<List<Integer>>> set=new HashSet<>();
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++)
        if(grid[i][j]==1 && v[i][j]==0){
            set.add(bfs(grid,v,i,j));
           
        }
        
        return set.size();
    }
    private List<List<Integer>> bfs(int[][] g,int[][] v, int row,int col){
        
        List<Integer> l=new ArrayList<>();
        
        List<List<Integer>> all=new ArrayList<>();
        
         l.add(0);
         l.add(0);
        all.add(l);
        
        Queue<List<Integer>> q=new LinkedList<>();
         List<Integer> p=new ArrayList<>();
         p.add(row);
         p.add(col);
        q.offer(p);
        
        int []r={-1,0,+1,0};
        int []c={0,+1,0,-1};
        
        v[row][col]=1;
        
        while(!q.isEmpty()){
            List<Integer> t=q.poll();
            for(int i=0;i<4;i++){
                int cRow=t.get(0)+r[i];
                int cCol=t.get(1)+c[i];
                if(cRow < 0 || cRow >= g.length || cCol < 0 || cCol >= g[0].length)continue;
                
                if(g[cRow][cCol]==1 && v[cRow][cCol]==0){
                    List<Integer> push=new ArrayList<>();
                    push.add(cRow);
                    push.add(cCol);
                    q.offer(push);
                    
                    List<Integer> count=new ArrayList<>();
                    count.add(cRow-row);
                    count.add(cCol-col);
                    all.add(count);
                    
                    v[cRow][cCol]=1;
                }
            }
        }
        return all;
        
    }
}
