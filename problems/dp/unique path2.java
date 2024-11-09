class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[r-1][c-1] == 1)return 0;

        int[][] dp=new int[r][c];

        for(int[] a: dp)
         Arrays.fill(a,-1);

        return countDistinct(obstacleGrid,dp,r-1,c-1);
    }
    private int countDistinct(int[][] arr,int[][]dp,int r,int c){
        if(r == 0 && c == 0)return 1;
        if(r < 0 || c < 0)return 0;
        if(arr[r][c] == 1) return 0;
        if(dp[r][c] != -1)return dp[r][c];

        int num1=countDistinct(arr,dp,r-1,c);
        int num2=countDistinct(arr,dp,r,c-1);
        return dp[r][c]=num1+num2;
    }
}
