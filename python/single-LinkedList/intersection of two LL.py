# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:

        len1 = 0
        len2 = 0
        temp1 = headA
        while temp1:
            len1 += 1
            temp1 = temp1.next
        
        temp2 = headB
        while temp2:
            len2 += 1
            temp2 = temp2.next
        
        t1 = headA
        t2 = headB

        if len1 > len2:
            dif = len1 - len2
            while dif > 0:
                dif -= 1
                t1 = t1.next
            
        elif len1 < len2:
            dif = len2 - len1
            while dif > 0:
                dif -= 1
                t2 = t2.next
        
        while t1 and t2:
            if t1 == t2: return t1
            t1 = t1.next
            t2 = t2.next
        
        return None

        
