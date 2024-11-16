class Solution {
    public int change(int amount, int[] coins) {
        if(amount == 0)return 1;
        if(coins.length == 1){
            if(amount % coins[0] == 0)return 1;
            return 0;
        }
        int dp[][] = new int[coins.length][amount+1];
        for(int a[] : dp)
         Arrays.fill(a, -1);

         return countCoins(coins, dp, coins.length -1, amount);
    }
    private int countCoins(int[] coins, int[][] dp, int ind, int amount){
        if(amount == 0)return 1;
         if(ind == 0){
            if(amount % coins[ind] == 0)return 1;
            return 0;
         }

         if(dp[ind][amount] != -1)return dp[ind][amount];

         int take = 0;
         if(coins[ind] <= amount)
           take = countCoins(coins, dp, ind , amount - coins[ind]);

         int notTake = countCoins(coins, dp, ind -1, amount);

        return dp[ind][amount] = take + notTake;
    }
}
