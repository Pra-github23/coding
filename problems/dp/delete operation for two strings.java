class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2))return 0;

        int [][]dp = new int[word1.length()][word2.length()];
        for(int a[] : dp)
        Arrays.fill(a, -1);

        return minOper(dp, word1, word2, word1.length()-1, word2.length()-1);
    }
    private int minOper(int[][] dp, String w1, String w2, int l1, int l2){
        if(l2 == 0){
            if(w2.charAt(0) == w1.charAt(l1) || w1.substring(0, l1+1).contains(w2.charAt(0)+"")) return l1;
            return l1+2;
        }
        if(l1 == 0){
            if(w1.charAt(0) == w2.charAt(l2) || w2.substring(0, l2+1).contains(w1.charAt(0)+"")) return l2;
            return l2+2;
        }

        if(dp[l1][l2] != -1)return dp[l1][l2];

        
        if(w1.charAt(l1) == w2.charAt(l2))return dp[l1][l2] = minOper(dp, w1, w2, l1-1, l2-1);
        
        int n1 =  1 + minOper(dp, w1, w2, l1 - 1, l2);
        int n2 =  1 + minOper(dp, w1, w2, l1, l2 -1);

        return dp[l1][l2] = Math.min(n1, n2);

    }
}
