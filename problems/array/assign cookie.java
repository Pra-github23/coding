class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        if(s.length == 0)return 0;
        int gCount = 0;
        int sCount = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(gCount < g.length && sCount < s.length){

            if(g[gCount] <= s[sCount]){
                gCount++;
            }
            sCount++;
        }
       
       return gCount;
    }
}
