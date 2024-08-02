class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return count(n,dp);
       
    }
 private int count(int n,int[]dp){
    if(n==0)return 1;
    if(dp[n] != -1)return dp[n];
    int one=count(n-1,dp);
    int two=0;
    if(2 <= n)two=count(n-2,dp);
    return dp[n]=one+two;
 }
}
