class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        
        
        int dp[][] = new int[s1.length()][s2.length()];
        
        for(int a[] : dp)
        Arrays.fill(a, -1);
        
        return maxCom(dp, s1, s2, s1.length()-1, s2.length()-1);
    }
    private int maxCom(int [][] dp, String s1, String s2, int l1 ,int l2){
        
        if(l1 == 0){
            if(s2.substring(0, l2+1).contains(s1.charAt(0)+""))return 1;
            return 0;
        }
        if(l2 == 0){
            if(s1.substring(0, l1+1).contains(s2.charAt(0)+""))return 1;
            return 0;
        }
        
        if(dp[l1][l2] != -1)return dp[l1][l2];
        
        int count =0;
        int t1 = l1;
        int t2 = l2;
        while(t1 >= 0 && t2 >= 0 && s1.charAt(t1) == s2.charAt(t2)){
            count ++ ;
            t1 --;
            t2--;
        }
        int count1 = maxCom(dp, s1, s2, l1, l2-1);
        int count2 = maxCom(dp, s1, s2, l1-1, l2);
        
        return dp[l1][l2] = Math.max(count, Math.max(count1, count2));
    }
}
