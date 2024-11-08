class Solution {
    public int maximumPoints(int arr[][], int N) {
        // code here
        
        int[][] dp=new int[N][arr[0].length+1];
        for(int[] a:dp)
        Arrays.fill(a,-1);
        
        return maxMerit(arr,dp,N-1,arr[0].length);
    }
    private int maxMerit(int[][] arr,int[][] dp,int day,int ind){
        if(day == 0){
            int max=Integer.MIN_VALUE;
            for(int i=0; i<arr[0].length ; i++){
                if(ind != i)
                max=Math.max(arr[day][i],max);
            }
            
            return max;
        }
        
        if(day < 0)return Integer.MIN_VALUE;
        if(dp[day][ind] != -1)return dp[day][ind];
        
        int maxGain=Integer.MIN_VALUE;
        
        for(int i=0; i<arr[0].length; i++){
            
            if(i != ind){
                maxGain=Math.max(maxGain,maxMerit(arr,dp,day-1,i)+arr[day][i]);
            }
            
        }
        
        return dp[day][ind]=maxGain;
        
    }
