class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2))return 0;
        if(word1.length()==0)return word2.length();
        if(word2.length()==0)return word1.length();
        int n=word1.length();
        int m=word2.length();
        long [][]dp=new long[n][m];
        for(long[]a:dp)
        Arrays.fill(a,-1);
        long num= min(word1,word2,n-1,m-1,dp);
        return (int)num;
    }
    private long min(String s,String ss,int n,int m,long [][]dp){
        if(n==0 && m==0){
            if(s.charAt(n)==ss.charAt(m))return 0;
            return 1;
        }
        if(m < 0 && n >= 0)return n+1;
        if(m >= 0 && n < 0)return m+1;
        if(m < 0 && n < 0)return Integer.MAX_VALUE;
        
        if(dp[n][m] != -1)return dp[n][m];
        
        if(s.charAt(n)==ss.charAt(m)){
           long c=min(s,ss,n-1,m-1,dp);
            dp[n][m]= c >= Integer.MAX_VALUE ? Integer.MAX_VALUE:(int)c;
        }
        else{
            long i=min(s,ss,n,m-1,dp)+1;
            long d=min(s,ss,n-1,m,dp)+1;
            long r=min(s,ss,n-1,m-1,dp)+1;
            dp[n][m]=Math.min(i,Math.min(d,r));
        }
        
       return dp[n][m];
    }
}
