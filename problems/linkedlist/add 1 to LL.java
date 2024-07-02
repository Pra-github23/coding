/*
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
    public static Node addOne(Node head) 
    { 
       
        Node temp=reverse(head);
        Node tt=temp;
        int carry=1;
        while(temp.next != null){
            int num=temp.data+carry;
            if(num > 9){
                temp.data=0;
                carry=1;
            }
            else {
                temp.data=num;
                carry=0;
                break;
            }
            temp=temp.next;
        }
        if(carry==1){
            int num=temp.data+1;
            if(num > 9){
                temp.data=0;
                temp.next= new Node(1);
            }
            else{
                temp.data=num;
            }
        }
      
      return reverse(tt);
     
    }
    private static Node reverse(Node root){
        if(root==null)return null;
        Node prev=null;
        while(root != null){
          
            Node temp=root.next;
            root.next=prev;
            prev=root;
            root=temp;
        }
        return prev;
    }
}
