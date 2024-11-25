class Solution {
    public int numDistinct(String s, String t) {
        if(t.length() > s.length())return 0;
        int [][]dp = new int[s.length()][t.length()];
        for(int a[] : dp)
        Arrays.fill(a, -1);
      
        return countDistinct(s, t, dp, s.length()-1, t.length()-1);
    }
    private int countDistinct(String s, String t, int[][] dp, int r, int c){
       
        if(c < 0)return 1;
        if(r < 0)return 0;

        if(dp[r][c] != -1)return dp[r][c];
 
        int match = 0;
        if(t.charAt(c) == s.charAt(r))
            match = countDistinct(s, t, dp, r-1, c-1);
            
         int notMatch = countDistinct(s, t, dp, r-1, c);    

        return dp[r][c] = match + notMatch;
    }
}
