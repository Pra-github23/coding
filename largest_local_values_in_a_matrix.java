class Solution {
    public int[][] largestLocal(int[][] grid) {
        int size=grid.length;
        int [][]arr=new int[size-2][size-2];
        for(int i=1;i<size-1;i++){
            for(int j=1;j<size-1;j++){
                int temp=0;
               for(int x=i-1;x<i+2;x++){
                for(int y=j-1;y<j+2;y++){
                   temp=Math.max(temp,grid[x][y]);
                }
               }
              arr[i-1][j-1]=temp;
            }
           
        }
         return arr;
    }
}