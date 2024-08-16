class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][][]dp=new int[prices.length][2][k+1];
        for(int[][]a : dp)
        for(int[]b : a)
        Arrays.fill(b,-1);
         return max(prices,0,k,0,dp);
    }
    private int max(int[]p,int ind,int k,int buy,int[][][]dp){
        if(k==0 || p.length==ind)return 0;
        if(dp[ind][buy][k] != -1)return dp[ind][buy][k];
        if(buy == 0){
            int num1=-1*p[ind]+max(p,ind+1,k,1,dp);
            int num2=max(p,ind+1,k,0,dp);
            return dp[ind][buy][k]=Math.max(num1,num2);
        }
        int num1=p[ind]+max(p,ind+1,k-1,0,dp);
        int num2=max(p,ind+1,k,1,dp);
        return dp[ind][buy][k]= Math.max(num1,num2);
    }
}
