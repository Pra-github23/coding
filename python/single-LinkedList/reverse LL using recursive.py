# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head is None: return head

        prev = None

        return self.reverse(head, prev)
    
    def reverse(self, head, prev):
        if head.next == None:
            head.next = prev
            return head
        
        nextNode = head.next
        head.next = prev
        return self.reverse(nextNode, head)
        
