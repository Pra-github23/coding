class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
            
            char ch=pre_exp.charAt(i);
            
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
            st.push(ch+"");
            else{
                String s1=st.pop();
                String s2=st.pop();
                st.push('('+s1+ch+s2+')');
            }
                
            
         }
         String infix=st.pop();
         Stack<Character> operator=new Stack<>();
         Map<Character,Integer> map=new HashMap<>();
         map.put('^',3);
         map.put('*',2);
         map.put('/',2);
         map.put('+',1);
         map.put('-',1);
         map.put('(',0);
         
         for(int i=0;i<infix.length();i++){
             
             char ch=infix.charAt(i);
             if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
              st.push(ch+"");
             else if(ch == '(')operator.push(ch);
             else if(ch == ')'){
                  while(!operator.isEmpty() && operator.peek() != '('){
                      String s1=st.pop();
                      String s2=st.pop();
                      st.push(s2+s1+operator.pop());
                  }
                  operator.pop();
             }
             else{
                 while(!operator.isEmpty() && map.get(operator.peek()) >= map.get(ch)){
                     String s1=st.pop();
                     String s2=st.pop();
                     st.push(s2+s1+operator.pop());
                 }
                 operator.push(ch);
             }
         }
         
         while(!operator.isEmpty()){
             String s1=st.pop();
             String s2=st.pop();
             st.push(s2+s1+operator.pop());
         }
         return st.peek();
    }
}
