class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return minCost(dp,arr,arr.length-1,k);
        
    }
    private int minCost(int[] dp,int[] arr,int ind,int k){
        if(ind == 0)return 0;
        if(ind < 0)return Integer.MAX_VALUE;
        if(dp[ind] != -1)return dp[ind];
        
        int temp=k;
        int min=Integer.MAX_VALUE;
        for(int i=ind; k > 0 && i >= 0; k--,i--){
            
            if(i-1 >= 0){
                int num1= Math.abs(arr[i-1]-arr[ind])+minCost(dp,arr,i-1,temp);
                min=Math.min(min,num1);
            }
        }
        return dp[ind]=min;
    }
}
