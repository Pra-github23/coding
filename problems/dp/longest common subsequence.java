class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       
        // memorization
        // int[][] dp =new int[text1.length()][text2.length()];
        // for(int a[] : dp)
        // Arrays.fill(a, -1);
       
       // return longestCommonLength(dp, text1, text2, text1.length()-1, text2.length()-1);

       // tabulation and space reduce
       int[] row = new int[text2.length()];
       boolean flag = false;

       for(int i=0;i<text2.length();i++){
       if(text1.charAt(0) == text2.charAt(i))row[i] = 1;
       else if(i != 0)row[i] = row[i-1];
       }
      

       for(int i=1; i< text1.length(); i++){

        int cur[] = new int[text2.length()];
          if(flag || row[0] == 1 || text2.charAt(0) == text1.charAt(i)) {
            cur[0] = 1;
            flag = true;
          }
     
        for(int j=1; j<text2.length(); j++){
           
           if(text1.charAt(i) == text2.charAt(j))cur[j] = 1 + row[j-1];
           else{
              int num1 = row[j];
              int num2 = cur[j -1];
              cur[j] =  Math.max(num1 ,num2);
           }
 
        }
        
        row = cur;
       }
 
        return row[text2.length()-1];

    }
    private int longestCommonLength(int[][] dp, String s1, String s2, int l1, int l2){
        if(l1 == 0){
          if(s2.substring(0, l2+1).contains(s1.charAt(l1)+"")) return 1;
          return 0;
        }
        if(l2 == 0){
            if(s1.substring(0, l1+1).contains(s2.charAt(l2)+""))return 1;
            return 0;
        }
        if(dp[l1][l2] != -1)return dp[l1][l2];
        if(s1.charAt(l1) == s2.charAt(l2)) return dp[l1][l2] = 1+longestCommonLength(dp, s1, s2, l1-1, l2-1);

        int countFirstString = longestCommonLength(dp, s1, s2, l1-1,l2);
        int countSecondString = longestCommonLength(dp, s1, s2, l1, l2-1);
        return dp[l1][l2] = Math.max(countFirstString, countSecondString);
    }
}
