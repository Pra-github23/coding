class Solution {
    public int rob(int[] nums) {
       int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
       return maxProfit(nums.length-1,nums,dp);
      
    }
    private int maxProfit(int index,int[] arr,int[]dp){
        if(index==0)return arr[index];
        if(index < 0)return 0;
        if(dp[index] != -1)return dp[index];
        int notTake=maxProfit(index-1,arr,dp);
        int take=Integer.MIN_VALUE;
        if(index-1 >= 0)take=arr[index]+maxProfit(index-2,arr,dp);
        return dp[index]=Math.max(notTake,take);
    }
}
