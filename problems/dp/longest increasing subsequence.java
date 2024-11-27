class Solution {
    public int lengthOfLIS(int[] nums) {

        int [][]dp = new int[nums.length][nums.length];
        for(int a[] : dp)
        Arrays.fill(a, -1);

        return maxCount(dp, nums, 0, -1);
    }
    private int maxCount(int[][] dp, int[] arr, int cur, int prev){
        if(cur == arr.length){
           
            return 0;
        }
      
        if(dp[cur][prev+1] != -1)return dp[cur][prev+1];

         int n1 = 0;
        if(prev == -1 || arr[prev] < arr[cur])n1 = maxCount(dp, arr, cur+1, cur)+1;
        int n2 = maxCount(dp, arr, cur+1, prev);
        return dp[cur][prev+1] = Math.max(n1, n2);
    }
}
