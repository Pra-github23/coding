class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()!=0 && t.length() == 0 ) return false;
        
        // memorization
        
        // int dp[][] = new int[s.length()+1][t.length()+1];
        
//         for(int a[] : dp)
//             Arrays.fill(a, -1);
    
         
//         return subSeq(s, t, s.length(), t.length(), dp) == s.length();
        
        
        // tabulation
        
         for(int i =1; i <= s.length(); i++){
             for(int j = 1; j <= t.length(); j++){
                 
                 if(s.charAt(i-1) == t.charAt(j-1))dp[i][j] = 1 + dp[i-1][j-1];
                 else{
                     dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                     
                 }
             }
         } 
        
        return dp[s.length()][t.length()] == s.length();
        
        
        
    }
    private int subSeq(String s, String t, int i, int j, int[][] dp){
        
        if(i == 0 || j == 0) return 0;
        
        if(dp[i][j] != -1)return dp[i][j];
        
        if(s.charAt(i-1) == t.charAt(j-1))return dp[i][j] = 1+subSeq(s, t, i-1, j-1, dp);
        
        int num1 = subSeq(s, t, i-1, j, dp);
        int num2 = subSeq(s, t, i, j-1, dp);
        
        return dp[i][j] = Math.max(num1, num2);
        
    }
}
