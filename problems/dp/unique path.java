class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];

        for(int[] a : dp)
        Arrays.fill(a,-1);

        return distinctPath(dp,m-1,n-1);
    }
    private int distinctPath(int[][] dp,int r,int c){
        if(r == 0 && c == 0)return 1;

        if(r < 0 || c < 0)return 0;
 
         if(dp[r][c] != -1)return dp[r][c];

        int c1= distinctPath(dp,r-1,c);
        int c2= distinctPath(dp,r,c-1);

        return dp[r][c]=c1+c2;
    }
}
