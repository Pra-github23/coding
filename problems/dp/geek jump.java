class Solution{
    public int minimumEnergy(int arr[],int N){
        //code here
        int dp[]=new int[N];
        Arrays.fill(dp,-1);
        return minEnergy(arr,dp,N-1);
    }
    private int minEnergy(int arr[],int[]dp,int ind){
        if(ind==0)return 0;
        if(ind < 0)return Integer.MAX_VALUE;
        if(dp[ind] != -1)return dp[ind];
        
        int num1=Math.abs(arr[ind-1]-arr[ind])+minEnergy(arr,dp,ind-1);
        int num2=(ind-2 >= 0) ? Math.abs(arr[ind-2]-arr[ind])+minEnergy(arr,dp,ind-2) : Integer.MAX_VALUE;
        return dp[ind]=Math.min(num1,num2);
    }
}
