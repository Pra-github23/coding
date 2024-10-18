class MinStack {
   Stack<Integer> st;
   Stack<Integer> min;
   
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        
        st.push(val);

        Stack<Integer> tempStore=new Stack<>();

        while(!min.isEmpty() && min.peek() < val){
            tempStore.push(min.pop());
        }

        min.push(val);

        while(!tempStore.isEmpty()){
            min.push(tempStore.pop());
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
      

    Stack<Integer> tempStore=new Stack<>();
    int num=st.pop();

        while(min.peek() != num){
            tempStore.push(min.pop());
        }
        min.pop();
        while(!tempStore.isEmpty()){
            min.push(tempStore.pop());
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;

       
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
