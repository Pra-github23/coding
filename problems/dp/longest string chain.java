class Solution {
    public int longestStrChain(String[] words) {
       
        Arrays.sort(words, (a,b)->Integer.compare(a.length(), b.length()));
       
        int dp[] = new int[words.length];
        Arrays.fill(dp, 1);
        int max =1;
        for(int i = 1; i <words.length; i++){
            for(int j = 0; j < i; j++){
                if(check(words[i], words[j])){
                   dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
    private boolean check(String s1, String s2){
        if(s1.length() != s2.length()+1)return false;
        int i=0;
        int j=0;
      
       while(j < s2.length() && i < s1.length()){
         
         if(s1.charAt(i) == s2.charAt(j))
             j++;
         i++;
       }
       return j == s2.length();

    }
}
