class Solution {
    public String addStrings(String num1, String num2) {
        
        String res ="";
        
        int s1 = num1.length()-1;
        int s2 = num2.length()-1;
        int carry = 0;
        
        while(s1 >= 0 && s2 >= 0){
            
            int num = carry + num1.charAt(s1)-48 +num2.charAt(s2)-48;
            
            res = num%10+res;
            carry = num/10;
            s1 -= 1;
            s2 -= 1;
            
        }
        
        while(s1 >= 0){
            int num = carry + num1.charAt(s1)-'0';
            res = num%10+res;
            carry = num/10;
            s1 -= 1;
        }
        while(s2 >= 0){
            int num = carry + num2.charAt(s2)-'0';
            res = num%10+res;
            carry = num/10;
            s2 -= 1;
        }
        if(carry > 0){
            res = carry+res;
            
        }
        return res;
    }
}
