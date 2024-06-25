/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow=head;
        Node fast=head;
        
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)break;
           
        }
        if(fast== null || fast.next == null){
         
            return 0;       // no loop
        }
        while(head != slow){
            head=head.next;
            slow=slow.next;
        }
        int count=1;
        slow=slow.next;
        while(head != slow){
            count++;
            slow=slow.next;
        }
        return count;
    }
}
