class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum =0;
        for(int a : nums)
        sum+=a;
       if(sum % 2 == 1)return false;

        int dp[][] = new int[nums.length][sum/2+1];
        for( int a[] : dp)
        Arrays.fill(a,-1);

        return isPartition(nums,dp,sum/2,nums.length-1) == 1;
    }
    private int isPartition(int arr[], int[][ ] dp, int t,int ind){
        if(t == 0)return 1;
        if(ind == 0){
            if(t == arr[0])return 1;
            return 0;
        }
        if(dp[ind][t] != -1)return dp[ind][t];

        int take =0;
         if(arr[ind] <= t)
         take = isPartition(arr, dp, t - arr[ind], ind-1);

        int notTake = isPartition(arr, dp, t, ind-1);
        return dp[ind][t] = take | notTake;
    }
}
