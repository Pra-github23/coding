/* Structure of Doubly Linked List
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
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
     
        while(head.data==x){
            head=head.next;
           
        }
         Node temp=head;
        
       
        while(temp != null){
            if(temp.next != null && temp.next.data == x){
               temp.next=delete(temp.next);
            }
            else
             temp=temp.next;
        }
        return head;
        
    }
    private static Node delete(Node root){
        if(root == null){
           return root;
        }
        
        if(root.next != null)
          root.next.prev=root.prev;
        return root.next;
    }
}
