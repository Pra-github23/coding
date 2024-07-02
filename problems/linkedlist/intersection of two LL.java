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
        int count1=0;
        ListNode t1=headA;
        while(t1 != null){
            count1++;
            t1=t1.next;
        }
        int count2=0;
        ListNode t2=headB;
        while(t2 != null){
            count2++;
            t2=t2.next;
        }
        if(count1 > count2){
            int diff=count1-count2;
            while(diff-- > 0){
                headA=headA.next;
            }
        }
        else{
            int diff=count2-count1;
            while(diff-- > 0){
                headB=headB.next;
            }
        }
        while(headA != null){
            if(headA == headB)return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;

    }
}
