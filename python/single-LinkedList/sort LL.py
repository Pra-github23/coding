# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        return self.mergeSort(head)
    
    def mergeSort(self, head):
        if head is None or head.next is None:
            return head
        temp = head
        midNode = self.middleNode(temp)

        rightNode = midNode
        
        return self.merge(self.mergeSort(head), self.mergeSort(rightNode))
    
    def merge(self, left, right):

        dummy = ListNode(0)
        temp = dummy

        while left is not None and right is not None:
            if left.val > right.val:
                temp.next = right
                right = right.next
            else:
                temp.next = left
                left = left.next 
            
            temp = temp.next
        
        if left is not None:
            temp.next = left
            
        
        if right is not None:
            temp.next = right
            
        
        return dummy.next

    
    def middleNode(self, root):
        slow = root
        fast = root
        p = None
        while fast is not None and fast.next is not None: 
            p = slow
            slow = slow.next
            fast = fast.next.next
        
        if p is not None:

            p.next = None
        
        return slow
        
