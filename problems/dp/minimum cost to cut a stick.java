class Solution {
    public int minCost(int n, int[] cuts) {
       
        Arrays.sort(cuts);

        int dp[][] = new int[cuts.length][cuts.length];

        for(int a[] : dp)
        Arrays.fill(a, -1);

        return minValue(0, n, dp, cuts, 0, cuts.length-1);
    }
    private int minValue(int left, int right, int[][] dp, int []cuts, int s, int e){
        if(e < s)return 0;

        if(dp[s][e] != -1)return dp[s][e];

         int min = Integer.MAX_VALUE;

        for(int i =s; i <= e; i++){
           
               int mini = (right - left)
                + minValue(left, cuts[i], dp, cuts, s, i-1) 
                + minValue(cuts[i], right, dp, cuts, i+1, e);
               min = Math.min(min,mini);
              
        }

        return dp[s][e] = min;
    
    }
}
