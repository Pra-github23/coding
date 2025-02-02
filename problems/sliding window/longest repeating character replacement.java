class Solution {
    public int characterReplacement(String s, int k) {
        
        int max = 0;
      
        for(int a =0; a<26; a++){
            int tK = k;
             int j =0;
            char fix = (char)('A'+a);
         for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
        
            if(ch != fix)--tK;
           
           if(tK < 0){
             while(fix == s.charAt(j)){
                                
                    j++;
                }
                tK =0;
                j++;

           }
 
            max = Math.max(max, i - j +1);

         }
        }
         return max;
    }
}
