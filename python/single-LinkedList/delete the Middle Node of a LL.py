# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head is None or head.next is None:
            head = None
            return head
        if head.next.next is None:
            head.next = None
            return head
        

        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            fast = fast.next.next
            slow = slow.next
        
        slow = self.deleteNode(slow)
        return head
    
    def deleteNode(self, root):
       
        if root.next is not None:
            root.val = root.next.val
            root.next = root.next.next
        
        return root

        
