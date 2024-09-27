class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
		for(int i=0;i<arr.length;i++)
		 arr[i]=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	   if(front==0 && rear==arr.length){
	       increaseSize(arr,rear);
	       arr[rear++]=x;
	   }
	   else{
	    rear%=arr.length;
	    arr[rear++]=x;
	   }
	   
	   return;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		if(front==rear && arr[rear] == -1)return -1;
		
		int num=arr[front];
		arr[front]=-1;
		front=(front+1)%arr.length;
		return num;
	} 
	private void increaseSize(int arr[],int size){
	    
	    int temp[]=new int[size+100];
	    
	    
	    for(int i=0;i<temp.length;i++)
	     if(i<=size)
	       temp[i]=arr[i];
	     else
	      temp[i]=-1;
	    
	    arr=temp;
	    return;
	}
}
