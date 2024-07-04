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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode t=dummy;
        int quo=count/k;
        while(quo-- > 0){
           t.next=reverse(t.next,k);
           int c=k;
           while(c-- > 0){
            t=t.next;
           }

        }
        return dummy.next;
    }
    private ListNode reverse(ListNode root,int k){
        if(root== null)return root;
        ListNode prev=null;
        ListNode dummy=root;
        while(k-- > 0){
            ListNode node=root.next;
            root.next=prev;
            prev=root;
            root=node;
        }
        dummy.next=root;
        return prev;
    }
}
