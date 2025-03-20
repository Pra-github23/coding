# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:

        
        slow = head
        fast = head

        while fast is not None and fast.next is not None:

            
            slow = slow.next
            fast = fast.next.next
            
        half = self.reverse(slow)
        temp = head
        while half is not None:
            print(temp.val)
            if half.val != temp.val:
                return False
            half = half.next
            temp = temp.next
        
        return True

    def reverse(self, root):

        prev = None

        while root is not None:
            temp = root.next
            root.next = prev
            prev = root
            root = temp
        
        return prev
        
            




        
