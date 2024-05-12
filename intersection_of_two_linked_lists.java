/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int aCount=0;
        while(temp != null){
        temp=temp.next;
        aCount++;
        }
        int bCount=0;
        temp=headB;
        while(temp != null){
            bCount++;
            temp=temp.next;
        }
        int countA=aCount-bCount;
        while(countA-- > 0)
            headA=headA.next;
        
        int countB=bCount-aCount;
        while(countB-- > 0)
            headB=headB.next;

        while(headB != null){
            if(headB==headA)return headB;
            headB=headB.next;
            headA=headA.next;
        }
        return null;
    }
}