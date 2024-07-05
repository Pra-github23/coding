class Solution {
    public int myAtoi(String s) {
        if(s.length()== 0)return 0;
        int i=0;
        while(i < s.length() && s.charAt(i) == ' ')i++;
         int count =0;
        while(i < s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            i++;
            count++;
            if(count > 1)return 0;
        }
       
      
       boolean flag= (i-1 >= 0 && s.charAt(i-1)== '-' )?true:false;

        while(i < s.length() && s.charAt(i)== '0')i++;

       StringBuilder sb=new StringBuilder();
       while(i < s.length()){
        char ch=s.charAt(i);
         if(Character.isDigit(ch))
           sb.append(ch+"");
         else break;
         i++;
       }
       long num=0;
       if(sb.length() >= 19 && flag)return Integer.MIN_VALUE;
       if(sb.length() >= 19)return Integer.MAX_VALUE;
       if(sb.length() > 0)
          num=Long.parseLong(sb.toString());
       if(flag)num=-1*num;
       if(num >= Integer.MAX_VALUE)return Integer.MAX_VALUE;
       if(num <= Integer.MIN_VALUE)return Integer.MIN_VALUE;
      return (int)num;
       
    }
}
