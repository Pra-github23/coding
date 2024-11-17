class Solution {
    static int knapSack(int capacity, int val[], int wt[]) {
        
        if(capacity == 1){
            int max =0;
            for(int i=0;i<val.length;i++){
                if(wt[i] == 1)max = Math.max(max,val[i]);
            }
            return max;
        }
        int[][]dp = new int[val.length][capacity+1];
        for(int a[] : dp)
        Arrays.fill(a,-1);
        
        return maxProfit(val, wt, dp, val.length-1, capacity);
    }
    private static int maxProfit(int []v, int[] w, int[][]dp, int ind, int c){
        if(c == 0)return 0;
        if(ind == 0){
            if(c % w[ind] >= 0)return (c/w[ind]) * v[ind];
            return 0;
        }
         if(dp[ind][c] != -1)return dp[ind][c];
         
         int take =0;
         if(w[ind] <= c)
         take = maxProfit(v, w, dp, ind, c - w[ind])+v[ind];
         
         int notTake = maxProfit(v, w, dp, ind-1, c);
         
         return dp[ind][c] = Math.max(take, notTake);
    }
}
