class Solution {
    public boolean validPalindrome(String s) {

        if(s.length() <= 2)return true;
       
        int count = 0;

        int x =0;
        int y= s.length()-1;

        while(x < y){

            if(s.charAt(x) != s.charAt(y)){
               if(count == 1)return false;
               count++;
               int flag = 0;
               if(s.charAt(x) == s.charAt(y-1)){
                
                flag = check(s, x, y-1);
                if(flag == 1)return true;

               }
               if(s.charAt(x+1) == s.charAt(y)){

                flag = check(s, x+1, y);
                if(flag == 0)return false;
                else return true;

               }
               else return false;
            
            }
            x++;
            y--;
        }
        return true;
    }
    private int check(String s, int x, int y){
        while(x < y){
            if(s.charAt(x) != s.charAt(y))return 0;
            x++;
            y--;
        }
        return 1;
    }
}
