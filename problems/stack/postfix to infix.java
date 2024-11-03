class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
               st.push(ch+"");
            else{
                String str1=st.pop();
                String str2=st.pop();
                st.push('('+str2+ch+str1+')');
            }
            
        }
        return st.peek();
    }
}
