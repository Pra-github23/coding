class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
         return sorts(s);
    }
    private Stack<Integer> sorts(Stack<Integer> s){
        if(s.size()==1)return s;
        int temp=s.pop();
        Stack<Integer> ss=sorts(s);
        if(ss.peek() <= temp){
            ss.push(temp);
        }
        else{
            elePosition(ss,temp);
        }
        return ss;
    }
    private void elePosition(Stack<Integer> ss,int ele){
        if(ss.isEmpty()){
            ss.push(ele);
            return;
        }
         
        if(ss.peek() > ele){
           int temp=ss.pop();
            elePosition(ss,ele);
             ss.push(temp);
        }
        else ss.push(ele);
           
        
        return;
    }
}
