class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int r = matrix.length;
        if(r == 1){
            int min = Integer.MAX_VALUE;
            for(int i=0; i<r; i++)min = Math.min(min,matrix[0][i]);
            return min;
        }
        int[][]dp = new int[r][r];
        for(int a[] : dp)
         Arrays.fill(a, Integer.MAX_VALUE);

        minPath(matrix, dp, r-1, r-1);

        int  min = Integer.MAX_VALUE;
        for(int i=0; i<r; i++){
            
              min = Math.min(min, dp[r-1][i]);
        }
        return min;
    }
    private int minPath(int[][] m, int[][] dp, int r,int c){
        if(r == 0){
          if( c < 0 || c >= m.length)return Integer.MAX_VALUE;
          return m[r][c];   
        }
        if(c < 0 || c >= m.length)return Integer.MAX_VALUE;

        if(dp[r][c] != Integer.MAX_VALUE)return dp[r][c];
        
         

        for(int i=0; i<m.length; i++){
            int min = Integer.MAX_VALUE;
             int num1 = minPath(m, dp, r-1, i-1);
             int num2 = minPath(m, dp, r-1, i+1);
             int num3 = minPath(m, dp, r-1, i);
             int temp1 = Math.min(num1, Math.min(num2, num3));
             min = Math.min(min,temp1 + m[r][i]);
             dp[r][i] = min;
        }
        
        return dp[r][c];
    }
}
