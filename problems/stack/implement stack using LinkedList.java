class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;
    
   
    void push(int a) {
     
        StackNode t=new StackNode(a);
        t.next=top;
        top=t;
    }

   
    int pop() {
      
        if(top == null)return -1;
        
        int peek=top.data;
        StackNode t=top.next;
        top=t;
        return peek;
    }
}
