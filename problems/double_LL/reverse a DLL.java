/*class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
                                                
                                                           Input:  LinkedList: 3 <--> 4 <--> 5
                                                           Output: 5 4 3
*/
public static Node reverseDLL(Node  head)
{
    //Your code here
   
    Node pre=null;
    while(head != null){
        Node t=head.next;
        if(t != null)
          t.prev=null;
        head.next=pre;
        if(pre != null)
           pre.prev=head;
        pre=head;
        head=t;
        
    }
    return pre;
    
}
