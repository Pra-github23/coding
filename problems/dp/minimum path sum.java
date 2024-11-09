class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][] dp=new int[r][c];

        for(int[] a:dp)
        Arrays.fill(a,-1);

        return sumPath(grid,dp,r-1,c-1);
    }
    private int sumPath(int[][] grid,int[][] dp,int r,int c){
        if(r == 0 && c == 0)return grid[0][0];
        if(r < 0 || c < 0)return Integer.MAX_VALUE;
        if(dp[r][c] != -1)return dp[r][c];

        int num1=sumPath(grid,dp,r-1,c);
        int num2=sumPath(grid,dp,r,c-1);
        return dp[r][c]=Math.min(num1,num2)+grid[r][c];
    }
}
