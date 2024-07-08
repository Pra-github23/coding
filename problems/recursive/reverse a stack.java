class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(!s.isEmpty()){
            int temp=s.pop();
            reverse(s);
            insertAtBottom(s,temp);
        }
    }
    private static void insertAtBottom(Stack<Integer> s, int ele){
        if(s.isEmpty())s.push(ele);
        else{
            int temp=s.pop();
            insertAtBottom(s,ele);
            s.push(temp);
        }
    }
}
