# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        count  = 0
        temp  = head
        while temp is not None:
            count += 1
            temp = temp.next
        
        forward = count - n -1
        if forward < 0 :
            t = head.next
            head = None
            return t

        temp = head

        while forward > 0:
            forward -= 1
            temp = temp.next
        
        if temp != None and temp.next != None:
            temp.next = temp.next.next
        
        return head

        
        
