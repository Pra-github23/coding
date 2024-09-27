class MyStack {
  Queue<Integer> q1;
 
    public MyStack() {
        q1=new LinkedList<>();
        
    }
    
    public void push(int x) {
        
        q1.offer(x);
        return;
    }
    
    public int pop() {
        if(q1.isEmpty())return -1;

        Queue<Integer> t=new LinkedList<>();
        int num=0;

        while(!q1.isEmpty()){
             num=q1.poll();
            if(!q1.isEmpty())
               t.offer(num);
        }
        while(!t.isEmpty())
         q1.offer(t.poll());

        return num;
    }
    
    public int top() {
        if(q1.isEmpty())return -1;
         Queue<Integer> t=new LinkedList<>();
         int num=0;

         while(!q1.isEmpty()){
            num=q1.poll();
            t.offer(num);
         }
         while(!t.isEmpty())
           q1.offer(t.poll());

        return num;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
