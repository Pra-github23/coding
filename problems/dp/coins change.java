class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)return 0;
       
        int dp[][] =new int[coins.length][amount+1];
        for(int a[] : dp)
        Arrays.fill(a, -1);

        int res = minCoins(coins, dp, coins.length-1, amount) ;
        return res == Integer.MAX_VALUE  ? -1 : res;
    }
    private int minCoins(int[] coins, int[][]dp, int ind, int amount){
        if(amount == 0)return 0;
        if(ind == 0){
            if(amount % coins[0] == 0)return amount / coins[0];
            
            return Integer.MAX_VALUE;
        }

        if(dp[ind][amount] != -1)return dp[ind][amount];

        int take = Integer.MAX_VALUE;
        if(coins[ind] <= amount)
        take = minCoins(coins, dp, ind, amount - coins[ind]) + 1;
        int notTake = minCoins(coins, dp, ind-1, amount);

        take = take < 0 ? Integer.MAX_VALUE : take;
        notTake = notTake < 0 ? Integer.MAX_VALUE :notTake;

        return dp[ind][amount] = Math.min(take, notTake);
    }
}
