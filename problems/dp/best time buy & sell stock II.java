class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        for(int []a : dp)
         Arrays.fill(a,-1);
        return max(prices,0,0,dp);
    }
    private int max(int[]p,int buy,int ind,int[][] dp){
        if(ind==p.length){
            
            return 0;
        }
        if(dp[ind][buy] != -1)return dp[ind][buy];
        if(buy == 0){
            int num1= (-1*p[ind])+max(p,1,ind+1,dp);
            int num2=max(p,0,ind+1,dp);
            return dp[ind][buy]=Math.max(num1,num2);
        }
       int num1=p[ind]+max(p,0,ind+1,dp);
       int num2=max(p,1,ind+1,dp);
       return dp[ind][buy]= Math.max(num1,num2);
    }
}
