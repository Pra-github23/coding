class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length ==2){
            if(nums[0] > nums[1])return nums[0];
            return nums[1];
        }
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int max1=maxP(nums,0,dp.length-2,dp);
        Arrays.fill(dp,-1);
        int max2=maxP(nums,1,nums.length-1,dp);
        return Math.max(max1,max2);
    }
    private int maxP(int[] arr,int s,int e,int[] dp){
        if(s > e)return 0;
        if(dp[s] != -1)return dp[s];
        int rob=arr[s]+maxP(arr,s+2,e,dp);
        int notRob=maxP(arr,s+1,e,dp);
        return dp[s]=Math.max(rob,notRob);
    }
}
