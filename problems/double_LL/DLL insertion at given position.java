class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here               //1 2 3 , pos =3 data=4;
                                    // output  :1 2 3 4
		if(head_ref == null)return;
		Node t=head_ref;
		while(t != null && pos-- > 0)
		   t=t.next;
		
		if(t != null){
		Node tt=t.next;
     	Node n=new Node(data);
     
     	t.next=n;
     	n.prev=t;
     	if(tt != null){
     	n.next=tt;
     	tt.prev=n;
     	}
     
     
     	}
     	else {
     	    Node n=new Node(data);
     	    t=n;
     	    n.prev=t.prev;
     	}
     	return ;
		
	}
}
