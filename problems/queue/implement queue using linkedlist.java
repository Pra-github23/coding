class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    
	void push(int a)
	{
      QueueNode t=new QueueNode(a);
       if(front == null){
           front=rear=t;
       }
       else{
            rear.next=t;
            rear=t;
       }
	}
	
    
	int pop()
	{
	    if(front == null)return -1;
	     
	     int peek=front.data;
	      QueueNode t=front.next;
	      front=t;
	      return peek;
      
	}
}
