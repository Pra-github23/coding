/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode t=head;
        while(t != null){
            t=t.next;
            count++;
        }
        if(n > count)return null;
        
        return remove(head,count-n);
    }
    private ListNode remove(ListNode root,int count){
            if(count == 0)return root.next;
            ListNode t=root;
            while(--count > 0){
                root=root.next;
            }
            root.next=root.next.next;
            return t;

    }
}
