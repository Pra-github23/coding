class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
       
        if(top==arr.length-1){
            increaseSize(arr,top);
        }
        arr[++top]=x;
        return;
    }

    public int pop() {
        if(top < 0)return -1;
        int num=arr[top];
        arr[top]=0;
        top--;
        return num;
        
    }
    private void increaseSize(int[] arr,int top){
        int temp[]=new int[top+50];
        for(int i=0;i<=top;i++)
         temp[i]=arr[i];
         
         arr=temp;
         return;
    }
}
