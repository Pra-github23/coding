class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        
        Map<Character,Integer> map=new HashMap<>();
        map.put('^',3);
        map.put('*',2);
        map.put('/',2);
        map.put('+',1);
        map.put('-',1);
        map.put('(',0);
        
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')sb.append(ch);
            else if(ch=='(' )st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
            }
           else{
                while(!st.isEmpty() && map.get(ch) <= map.get(st.peek()) ){
                    sb.append(st.pop());
                    
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty())sb.append(st.pop());
        return sb.toString();
    }
}
