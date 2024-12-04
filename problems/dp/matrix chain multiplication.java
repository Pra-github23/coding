class Solution {
    static int matrixMultiplication(int arr[]) {
       
        int dp[][] = new int[arr.length][arr.length];
        
        for(int a[] : dp)
        Arrays.fill(a, -1);
        
        return minCount(dp, arr, 1, arr.length-1);
    }
    static private int minCount(int[][] dp, int arr[], int i, int j){
        
        if(i == j)
        return 0;
        
        if(dp[i][j] != -1)return dp[i][j];
     int mini = Integer.MAX_VALUE;
    
    // partioning loop
    for(int k = i; k< j; k++){
        
        int ans = minCount(dp, arr,i,k) + minCount(dp, arr, k+1,j) + arr[i-1]*arr[k]*arr[j];
        
        mini = Math.min(mini,ans);
        
    }
    
    return dp[i][j]= mini;
    }
}
