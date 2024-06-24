class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    { if(head==null)return new Node(x);
       Node node=new Node(x);
       node.next=head;
       head= node;
       return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        if(head==null)return new Node(x);
        Node t=head;
        while(t.next != null)t=t.next;
        t.next=new Node(x);
        return head;
    }
}
