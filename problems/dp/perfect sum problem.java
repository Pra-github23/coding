class Solution{
    
    int[][] dp;
    int mod = (int)1e9 + 7;
    
    int func(int[] arr, int pos, int sum) {
        
        if(pos < 0){
            if(sum == 0)return 1;
            return 0;
        }
        
        if (dp[pos][sum] != -1)
            return dp[pos][sum];
        
        dp[pos][sum] = 0;
        
        dp[pos][sum] += func(arr, pos -1, sum) % mod;
        dp[pos][sum] %= mod;
        
        if (arr[pos] <= sum) {
            dp[pos][sum] += func(arr, pos -1, sum - arr[pos]) % mod;
            dp[pos][sum] %= mod;
        }
        
        return dp[pos][sum];
    }

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    dp = new int[arr.length][sum + 1];
	    for (int[] a : dp) {
	        Arrays.fill(a, -1);
	    }
	    return func(arr, arr.length -1, sum);
	} 
}
