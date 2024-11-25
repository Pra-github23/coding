class Solution {
    public int numDistinct(String s, String t) {
        if(t.length() > s.length())return 0;


        //memorization

        // int [][]dp = new int[s.length()+1][t.length()+1];
        // for(int a[] : dp)
        // Arrays.fill(a, -1);
      
        // return countDistinct(s, t, dp, s.length()-1, t.length()-1);
       
       // tabulation

        // for(int i = 1; i <= s.length(); i++){
        //     dp[i-1][0] = 1;
        //     for(int j = 1; j <= t.length(); j++){
        //     //    dp[0][j-1] = 1;
        //         if(t.charAt(j-1) == s.charAt(i-1))dp[i][j] =  dp[i-1][j-1] + dp[i-1][j];
        //         else dp[i][j] = dp[i-1][j];
        //     }
        // }
        //    return dp[s.length()][t.length()]; 

        //tabulation and reduce space

        int prevRow[] = new int[t.length()+1];
        int curRow[] = new int[t.length()+1];

        for(int i = 1; i <= s.length(); i++){
           
            for(int j =1; j<= t.length(); j++){
                if(j == 1)prevRow[j-1] = 1;
                if(t.charAt(j-1) == s.charAt(i-1)) curRow[j] = prevRow[j-1] + prevRow[j];
                else curRow[j] = prevRow[j];
            }
            prevRow = curRow.clone();

        }
        return prevRow[t.length()];


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
