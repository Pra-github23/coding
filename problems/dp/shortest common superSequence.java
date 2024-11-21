class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
        int [][]dp =new int[str1.length()+1][str2.length()+1];

        int m = str1.length();
        int n = str2.length();

        for(int i = 1; i <= m ; i++){
            for(int j = 1; j <= n ; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1))dp[i][j] = 1 + dp[i-1][j-1];
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return shortSeq(dp, str1, str2, str1.length(), str2.length());
    }
    private String shortSeq(int [][]dp, String s1, String s2, int l1, int l2){
        if(l1-1 == 0){
            if(s2.substring(0,l2).contains(s1.charAt(0)+"")) return s2.substring(0, l2);
            return  s2.substring(0, l2) + s1.charAt(0);
        }
        if(l2-1 == 0){
            if(s1.substring(0,l1).contains(s2.charAt(0)+"")) return s1.substring(0, l1);
            return  s1.substring(0, l1) + s2.charAt(0);
        }

        if(s1.charAt(l1 - 1) == s2.charAt(l2-1))return  shortSeq(dp, s1, s2, l1-1, l2-1) + s1. charAt(l1-1);
        if(dp[l1][l2-1] >= dp[l1-1][l2])
          return   shortSeq(dp, s1, s2, l1, l2 - 1) + s2.charAt(l2-1);

       return   shortSeq(dp, s1, s2, l1 - 1, l2) + s1.charAt(l1-1);
     
    }
}
