class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=0;i<post_exp.length();i++){
            char ch=post_exp.charAt(i);
            
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch<= '9'))
            st.push(ch+"");
            else{
                String s1=st.pop();
                String s2=st.pop();
                st.push('('+s2+ch+s1+')');
            }
        }
        
        String infix=st.pop();
        Stack<Character> sb=new Stack();
        Map<Character,Integer> map=new HashMap<>();
        map.put('^',3);
        map.put('/',2);
        map.put('*',2);
        map.put('+',1);
        map.put('-',1);
        map.put('(',0);
        
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ||(ch >= '0' && ch <= '9'))
            st.push(ch+"");
            else if(ch == ')'){
                while(!sb.isEmpty() && sb.peek() != '('){
                     String s1=st.pop();
                     String s2=st.pop();
                     st.push(sb.pop()+s2+s1);
                }
                sb.pop();
            }
            else if(ch == '(')sb.push(ch);
            else{
                while(!sb.isEmpty() && map.get(ch) <= map.get(sb.peek())){
                     String s1=st.pop();
                     String s2=st.pop();
                     st.push(sb.pop()+s2+s1);
                }
                sb.push(ch);
            }
        }
        return st.peek();
    }
}
