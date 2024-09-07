class Solution {
    public int numEnclaves(int[][] grid) {
        int row=grid.length-1;
        int col=grid[0].length-1;
        int[][]v= new int[row+1][col+1];
        int[] adjRow={-1,0,+1,0};
        int[] adjCol={0,+1,0,-1};
        for(int i=0;i<=row;i++){
            if(grid[i][0] == 1 && v[i][0] == 0) 
            dfs(grid,v,i,0,adjRow,adjCol);

            if(grid[i][col]==1 && v[i][col] == 0)
            dfs(grid,v,i,col,adjRow,adjCol);
        }
        for(int i=0;i<=col;i++){
            if(grid[0][i] == 1 && v[0][i] == 0)
            dfs(grid,v,0,i,adjRow,adjCol);

            if(grid[row][i] == 1 && v[row][i]==0)
            dfs(grid,v,row,i,adjRow,adjCol);
        }
        int count=0;
        for(int i=0;i<=row;i++)
        for(int j=0;j<=col;j++)
        if(grid[i][j]==1 && v[i][j]==0)
         count++;

         return count;
    }
private void dfs(int[][] g,int[][] v,int row,int col,int[]aR,int[]aC){
    v[row][col]=1;
    for(int i=0;i<4;i++){
        int r=row+aR[i];
        int c=col+aC[i];
        if(r < 0 || r >= g.length || c < 0 ||c >= g[0].length) continue;
        if(g[r][c]==1 && v[r][c]==0)
        dfs(g,v,r,c,aR,aC);
    }
}
}
