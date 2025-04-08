class Solution {
    public int islandPerimeter(int[][] grid) {
        
        
        // int count[] = new int[1];
        int countCell[] = new int[1];
        
        for(int i =0; i<grid.length; i++){
            int flag = 0;
            for(int j =0;j<grid[0].length; j++)
                if(grid[i][j] == 1 && perimeter(grid, i, j, countCell)){
                    flag  = 1;
                    break;
                }
            if(flag == 1)
               break;
        }
        
        return countCell[0];
        
    }
    private boolean perimeter(int [][] grid, int row, int col, int[] countCell){
        
        int r[] = new int[]{-1,0,+1,0};
        int c[] = new int[]{0,+1,0,-1};
        
        int v[][] = new int[grid.length][grid[0].length];
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});
         v[row][col] = 1;
        
        while(!q.isEmpty()){
            int[] root = q.poll();
            
                        
            countCell[0]+=4;
           
            
            for(int i =0; i< 4; i++){
                
                int curRow = root[0]+r[i];
                int curCol = root[1]+c[i];
                
                if(curRow < 0 || curRow >= grid.length || curCol < 0 || curCol >= grid[0].length)continue;
                
                if(grid[curRow][curCol] == 0) continue;
                
               
                
                countCell[0] -= 1;
                
                if (v[curRow][curCol] == 0){              
                   q.offer(new int[]{curRow, curCol});
                   v[curRow][curCol] = 1;
                }
                
                
            }
            
        }
        
        return true;
    }
}
