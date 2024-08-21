class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder  sb=new StringBuilder(s);
        String d=sb.reverse().toString();
        int dp[][]=new int[s.length()][d.length()];
        for(int[] a: dp)
        Arrays.fill(a,-1);
        return palindrome(s,d,s.length()-1,d.length()-1,dp);
        
        
    }
    private int palindrome(String s,String d,int ind1,int ind2,int[][] dp){
               
               if(ind1 < 0 || ind2 < 0)return 0;
               if(dp[ind1][ind2] != -1)return dp[ind1][ind2];
               if(s.charAt(ind1)==d.charAt(ind2)) return dp[ind1][ind2]=palindrome(s,d,ind1-1,ind2-1,dp)+1;

               int num1=palindrome(s,d,ind1-1,ind2,dp);
               int num2=palindrome(s,d,ind1,ind2-1,dp);
               return dp[ind1][ind2]=Math.max(num1,num2);
    }
}
