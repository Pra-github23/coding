class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch <= 122 && ch >= 97){
                st.push(ch);
            }
            else if(!st.isEmpty())st.pop();
        }
        StringBuilder sb=new StringBuilder();
       while(!st.isEmpty()){
           sb.append(st.pop());
       }
        return sb.reverse().toString();
    }
}