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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next != null && fast.next.next != null){
        slow=slow.next;
        fast=fast.next.next;
       }
       slow=rev(slow.next);
       while(slow != null){
        if(slow.val != head.val)return false;
        head=head.next;
        slow=slow.next;
       }
        return true;
    }
    private ListNode rev(ListNode root){
        ListNode prev=null;
        while(root != null){
            ListNode t=root.next;
            root.next=prev;
            prev=root;
            root=t;
        }
        return prev;
    }
}
