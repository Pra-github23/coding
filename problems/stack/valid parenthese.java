class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
 
       Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch == '{' || ch == '['){
                switch(ch){
                    case '(': st.push(')'); break;
                    case '{': st.push('}'); break;
                    case '[': st.push(']'); break;
                }
            }
            else{
                if(st.isEmpty() || st.peek()  != ch)return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
