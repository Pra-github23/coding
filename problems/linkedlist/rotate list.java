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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0)return head;
        int count=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next != null){
            count++;
            temp=temp.next;
        }
        int rem=k%count;
        int remaining=count-rem;
        temp=dummy;
        temp.next=reverse(temp.next,remaining);
        while(remaining-- > 0){
            temp=temp.next;
        }
        temp.next=reverse(temp.next,rem);
        return reverse(dummy.next,count);
    }
    private ListNode reverse(ListNode root ,int count){
        if(root == null)return root;
        ListNode prev=null;
        ListNode dummy=root;
        while(root != null && count-- > 0){
            ListNode node=root.next;
            root.next=prev;
            prev=root;
            root=node;
        }
      
        dummy.next=root;
        return prev;
    }
}
