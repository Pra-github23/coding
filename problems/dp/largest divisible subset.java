class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> l = new ArrayList<>();
        if(nums.length == 1){
            l.add(nums[0]);
            return l;
        }
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);

       Arrays.sort(nums);

       int max = 1;
       int ind = 0;
        for(int i = 1; i<nums.length; i++){
            for(int j = 0; j<i; j++){
                if(nums[i] % nums[j] == 0){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(max < dp[i]){
                max = dp[i];
                ind = i;
            }
         }

         
         l.add(nums[ind]);
         for(int i = ind-1; i >= 0; i--){
            if(dp[ind]-1 == dp[i] && nums[ind] % nums[i] == 0){
                l.add(nums[i]);
                ind = i;
            }
         }
         Collections.reverse(l);
         return l;
    }
}
