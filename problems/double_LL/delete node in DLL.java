/*class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here
	if(x==1)return head.next;
	Node t=head;
	while(t != null && --x > 0){
	    t=t.next;
	}
    if(t != null){
        Node n=t.next;
        t.prev.next=n;
        if(n != null){
            n.prev=t.prev;
        }
    }
   
	
	return head;
    }
}
