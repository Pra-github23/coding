class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];//Integer.MAX_VALUE;
        int profit;
        int overAllProfit=0;
      
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy)
            buy=prices[i];
            if(overAllProfit < prices[i]-buy)
             overAllProfit=prices[i]-buy;
        }
       
         return overAllProfit;

    }
 
}