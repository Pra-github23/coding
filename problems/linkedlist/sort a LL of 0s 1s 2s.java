/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node t=head;
        Node zero=new Node(0);
        Node dZero=zero;
      
        Node one=new Node(0);
        Node dOne=one;
     
        Node two=new Node(0);
        Node dTwo=two;
    
        while(t != null){
            if(t.data==1){
                dOne.next=t;
                dOne=dOne.next;
            }
            else if(t.data == 2){
                dTwo.next=t;
                dTwo=dTwo.next;
            }
            else{
                dZero.next=t;
                dZero=dZero.next;
            }
            t=t.next;
        }
        dZero.next=one.next != null?one.next:two.next;
        dOne.next=two.next;
        dTwo.next=null;
        return zero.next;
    }
}
