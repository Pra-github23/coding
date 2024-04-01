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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode temp=head;
       

        return mergeSort(temp);
    }
    private ListNode mergeSort(ListNode root){
        if(root.next == null)return root;
       // ListNode left=root;
        ListNode left=findMid(root);
         
        ListNode right=left.next;
        left.next=null;
        return merge(mergeSort(root),mergeSort(right));
    }
    private ListNode merge(ListNode leftPart,ListNode rightPart){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
       while(leftPart != null && rightPart != null){
        if(leftPart.val < rightPart.val){
            curr.next=leftPart;
            leftPart=leftPart.next;
        }
        else{
            curr.next=rightPart;
            rightPart=rightPart.next;
        }
        curr=curr.next;
       }
       if(leftPart != null)curr.next=leftPart;
       else curr.next=rightPart;
       return dummy.next;
    }
    private ListNode findMid(ListNode temp){
        ListNode slow=temp;
        ListNode fast=temp;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}