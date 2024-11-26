class Solution {
    public boolean isMatch(String s, String p) {
        
        if(s.length() == 0 && (p.length() == 0 || (p.length() == 1 && p.charAt(0) == '*')))return true;
        int [][]dp = new int[s.length()][p.length()];

        for(int a[] : dp)
        Arrays.fill(a, -1);

        return isBool(dp, s, p, s.length()-1, p.length()-1) == 1;
    }
    private int isBool(int [][] dp, String s, String p, int l1, int l2){
       
       if(l1 < 0 && l2 < 0)return 1;
       if(l1 < 0 ){
        while(l2 >= 0 && p.charAt(l2) == '*')l2--;
        if(l2 < 0)return 1;
        return 0;
       }
       if(l2 < 0)return 0;

        if(dp[l1][l2] != -1)return dp[l1][l2];
        
        if(p.charAt(l2) == '?' || s.charAt(l1) == p.charAt(l2)){
          return dp[l1][l2] = isBool(dp, s, p, l1-1, l2-1);
        }
        else if(p.charAt(l2) == '*'){
            int n1 = isBool(dp, s, p, l1, l2-1);
            int n2 = isBool(dp, s, p, l1-1, l2);
            return dp[l1][l2] = n1 | n2;
        }
        return dp[l1][l2] = 0;
        
    }
}
