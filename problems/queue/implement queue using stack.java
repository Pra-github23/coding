class MyQueue {
   Stack<Integer> s1;
    public MyQueue() {
        s1=new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> t=new Stack<>();
       
        while(!s1.isEmpty())
         t.push(s1.pop());
        
        t.push(x);
        
        while(!t.isEmpty())
         s1.push(t.pop());

         return;
    }
    
    public int pop() {
        if(s1.isEmpty())return -1;
        return s1.pop();
    }
    
    public int peek() {
        if(s1.isEmpty())return -1;

      
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
