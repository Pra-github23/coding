# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head is None or head.next is None or head.next.next is None: return head

        odd = head
        tempOdd = odd
        even = head.next
        tempEven = even
        
        while tempOdd.next.next is not None and tempEven.next.next is not None:
            tempOdd.next = tempOdd.next.next
            tempOdd = tempOdd.next
        
            tempEven.next = tempEven.next.next
            tempEven = tempEven.next
     
        while tempOdd.next is not None and tempOdd.next.next is not None:
            tempOdd.next = tempOdd.next.next
            tempOdd = tempOdd.next
        
        while tempEven.next is not None and tempEven.next.next is not None:
            tempEven.next = tempEven.next.next
            tempEven = tempEven.next

        tempEven.next = None
        
        tempOdd.next = even
        return odd

        
