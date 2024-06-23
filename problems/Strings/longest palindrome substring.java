class Solution {
    public String longestPalindrome(String s) {
        //String max="";
          StringBuilder max=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int f=i;
            int e=i;
           
           
            while(f >=0 && e < s.length()){
              if(s.charAt(f) != s.charAt(e))break;
              f--;
              e++;
            }
            if(max.length() < e-(f+1)){
                max.delete(0,max.length());
            max.append(s.substring(f+1,e));
            }
          
            f=i;
            e=i+1;
            while(f >= 0 && e < s.length()){
                if(s.charAt(f) != s.charAt(e))break;
                f--;
                e++;
            }
             if(max.length() < e-(f+1)){
                max.delete(0,max.length());
              max.append(s.substring(f+1,e));
             }
          
        }
        return max.toString();
    }
}
