class Solution {
    public int maxProfit(int[] prices) {
        int[][][]dp=new int[prices.length][2][3];
        for(int[][]a:dp)
        for(int[]b:a)
        Arrays.fill(b,-1);

        return max(prices,0,0,2,dp);
    }
    private int max(int[]p,int ind ,int buy,int c,int[][][]dp){
        if(c==0 || p.length==ind)return 0;
        if(dp[ind][buy][c] != -1)return dp[ind][buy][c];
         if(buy==0){
            int num1=(-1*p[ind])+max(p,ind+1,1,c,dp);
            int num2=max(p,ind+1,0,c,dp);
            return dp[ind][buy][c]= Math.max(num1,num2);
         }
         int num1=p[ind]+max(p,ind+1,0,c-1,dp);
         int num2=max(p,ind+1,1,c,dp);
         return dp[ind][buy][c]=Math.max(num1,num2);
        
    }
}
