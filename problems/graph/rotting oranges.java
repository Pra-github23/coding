class Temp{
    int row;
    int col;
    int time;
    Temp(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int count=0;
        int v[][]=new int[grid.length][grid[0].length];
        Queue<Temp> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++){
        if(grid[i][j]==1){
          count++;
        }
        if(grid[i][j]==2){
           
           
            q.offer(new Temp(i,j,0));

        }
        }
        if(count==0)return 0;
        return time(grid,q,v,count);
    }
    
    private int time(int[][] grid, Queue<Temp> q,int[][] v,int count){
     int maxTime=0;
     while(!q.isEmpty()){
          Temp t=q.poll();
          int row=t.row;
          int col=t.col;
          int time=t.time;
       System.out.println(row+" "+col+" "+time+" "+count);
          if(v[row][col] == 1)continue;
          if(v[row][col]==2)
              v[row][col]=1;
          int tm=maxTime;
          if(row-1 >= 0 && grid[row-1][col]==1 && v[row-1][col] != 1 && v[row-1][col] != 2){
            v[row-1][col]=2;
           q.offer(new Temp(row-1,col,time+1));
           maxTime=Math.max(tm,time+1);
           count--;
          }
          if(row+1 < grid.length && grid[row+1][col]==1 && v[row+1][col] != 1 && v[row+1][col] != 2){
            v[row+1][col] =2;
            q.offer(new Temp(row+1,col,time+1));
            maxTime=Math.max(tm,time+1);
            count--;
          }
          if(col-1 >= 0 && grid[row][col-1]==1 && v[row][col-1] != 1 && v[row][col-1] != 2){
            v[row][col-1] = 2;
            q.offer(new Temp(row,col-1,time+1));
            maxTime=Math.max(tm,time+1);
            count--;
          }
          if(col+1 < grid[0].length && grid[row][col+1]==1 && v[row][col+1] != 1 && v[row][col+1] != 2){
             v[row][col+1] = 2;
            q.offer(new Temp(row,col+1,time+1));
            maxTime=Math.max(tm,time+1);
            count--;
          }
     }
     if(count != 0)return -1;
     return maxTime;
    }
}
