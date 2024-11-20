class Solution {
    public int minInsertions(String s1) {
     
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String s2 = sb.toString();
       
       
        int m = s1.length();

      
        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];


        for (int ind1 = 1; ind1 <= m; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    cur[ind2] = 1 + prev[ind2 - 1];
                else
                    cur[ind2] = Math.max(prev[ind2], cur[ind2 - 1]);
            }

           
            prev = cur.clone();
        }
 
        return m - prev[m];
    }
   
}
