/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if(head==null)return null;
        Node t=head;
        while(t != null){
            Node node=t.next;
            Node newNode=new Node(t.val);
            t.next=newNode;
            newNode.next=node;
            t=node;
        }
        t=head;
        while(t != null){
           t.next.random=t.random == null ? null:t.random.next;
           t=t.next.next;
        }
        Node copy=head.next;
        t=head;
        while(t != null){
            Node node=t.next;
            t.next= t.next==null?null:t.next.next;
            node.next=node.next==null ? null: node.next.next;
            t=t.next;
        }
        return copy;
    }
}
