class Solution {
    public int maxProfit(int[] prices, int fee) {
        int [][]dp=new int[prices.length][2];
        for(int[]a :dp)
        Arrays.fill(a,-1);
        return max(prices,0,0,fee,dp);
    }
    private int max(int[]p,int ind,int buy,int fee,int[][]dp){
        if(ind==p.length)return 0;
        if(dp[ind][buy] != -1)return dp[ind][buy];
        if(buy==0){
            int num1=-1*p[ind]+max(p,ind+1,1,fee,dp);
            int num2=max(p,ind+1,0,fee,dp);
            return dp[ind][buy]=Math.max(num1,num2);
        }
        int num1=p[ind]-fee+max(p,ind+1,0,fee,dp);
        int num2=max(p,ind+1,1,fee,dp);
        return dp[ind][buy]=Math.max(num1,num2);
    }
}
