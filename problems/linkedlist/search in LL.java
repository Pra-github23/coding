/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node t=head;
        while(t != null){
            if(t.data==key)return true;
            t=t.next;
        }
        return false;
    }
}
