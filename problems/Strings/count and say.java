class Solution {
    public String countAndSay(int n) {

        StringBuilder sb = new StringBuilder("1");
      
        while(--n > 0){
           
            StringBuilder s = new StringBuilder();
            int len = sb.length();
           
            int i =0;
            while(i < len){
             
            int count =0;
            char ch = sb.charAt(i);
          
             while(i < len  && ch == sb.charAt(i)){
             
                ++count;
                ++i;
             }
             s.append(""+count+ch);
            }
            sb.setLength(0);
            sb.append(s.toString());
           

        }
        return sb.toString();
    }
}
