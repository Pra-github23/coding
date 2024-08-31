class Solution {
    public int minCut(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return min(s,0,dp)-1;
    }
    private int min(String s,int ind,int[] dp){
        
        if(s.length() <= ind)return 0;
       
        int minCount=Integer.MAX_VALUE;
       if(dp[ind] != -1)return dp[ind];
     
        for(int i=ind;i<s.length();i++){

           boolean flag=isPalindrome(s,ind,i);
           
           if(flag){
             int num=min(s,i+1,dp);
             
              minCount=Math.min(minCount,num+1);
            }
        }
        return dp[ind]=minCount;
    }
    private boolean isPalindrome(String s,int low,int high){
        
        while(low < high){
            if(s.charAt(low) != s.charAt(high))
             return false;
             low++;
             high--;
        }
        return true;
    }
}
