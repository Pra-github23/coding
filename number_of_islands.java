class Solution {
    static int visited[][];
    public int numIslands(char[][] grid) {
 
         int count=0;
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    checkIsland(grid ,i,j);
                    count++;
                }
            }
         }
         return count;
     }
     private void checkIsland(char [][] grid,int row,int col){
          if(row >= grid.length || row < 0 || col < 0 || col >= grid[0].length || grid[row][col] == '0')return;
          if(grid[row][col] == '1')
           grid[row][col]='0';
        checkIsland(grid,row+1,col);
        checkIsland(grid,row-1,col);
        checkIsland(grid,row,col-1);
        checkIsland(grid,row,col+1);
     }
}