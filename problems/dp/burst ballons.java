class Solution {
    public int maxCoins(int[] nums) {
        
        int [][]dp = new int[nums.length][nums.length];

        for(int a[] : dp)
         Arrays.fill(a, -1);

        return max(1, 1, dp, nums, 0, nums.length-1);
    }
    private int max(int left, int right, int[][] dp, int[] nums, int s, int e){
        if(s > e)return 0;

        if(dp[s][e] != -1) return dp[s][e];

         int maxi = Integer.MIN_VALUE;

        for(int i=s; i<=e; i++){
            int max = nums[i] * left * right;
           
            max = max + max(left, nums[i], dp, nums, s, i-1) + max(nums[i], right, dp, nums, i+1, e);
            maxi = Math.max(maxi, max);
        }

        return dp[s][e] = maxi;
    }
}
