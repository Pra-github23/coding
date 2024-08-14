class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()==0 && s2.length()==0 && s3.length()==0)return true;
        if(s1.length()==0) return s2.equals(s3);
        if(s2.length()==0)return s1.equals(s3);
        int[][][] dp=new int[s3.length()][s1.length()+1][s2.length()+1];
        for(int[][] a:dp)
        for(int []b :a)
           Arrays.fill(b,-1);
        return interConnect(s1,s1.length(),s2,s2.length(),s3,s3.length()-1,dp)==1;
    }
    private int interConnect(String s1,int l1,String s2,int l2,String s3,int l3,int[][][]dp){
        if(l3==0){
            if((l1 == 0 && l2 == 1 && s2.charAt(l2-1)==s3.charAt(l3)) ||(l2 == 0 && l1 == 1 && s1.charAt(l1-1)==s3.charAt(l3))) return 1;
            return 0;

            
        }
        System.out.println(dp[l3]+" ->"+l3+"  "+l2+"  "+l1);
        if(l1 >= 0 && l2 >= 0 && dp[l3][l1][l2] != -1)return dp[l3][l1][l2];
        int n=0;
        int m=0;
        System.out.println("pass");
        if(l1 > 0 && s1.charAt(l1-1)==s3.charAt(l3)){
          n=interConnect(s1,l1-1,s2,l2,s3,l3-1,dp);
        }
        if(l2 > 0 && s2.charAt(l2-1)==s3.charAt(l3)){
            m=interConnect(s1,l1,s2,l2-1,s3,l3-1,dp);
        }
        return dp[l3][l1][l2]=n|m;
    }
}
