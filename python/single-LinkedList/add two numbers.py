# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        results = ListNode(0)
        dummy = results
        carry  = 0

        while l1 and l2:

            num = l1.val + l2.val + carry
            dummy.next = ListNode(num%10)
            carry = num//10
            dummy = dummy.next
            l1 = l1.next
            l2 = l2.next
        
        while l1:
            num = l1.val + carry
            dummy.next = ListNode(num%10)
            carry = num//10
            dummy = dummy.next
            l1 = l1.next
        
        while l2:
            num = l2.val + carry
            dummy.next = ListNode(num%10)
            carry = num//10
            dummy = dummy.next
            l2 = l2.next
        
        if carry > 0:
            dummy.next = ListNode(carry)
        return results.next

            # Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        results = ListNode(0)
        dummy = results
        carry  = 0

        while l1 and l2:

            num = l1.val + l2.val + carry
            dummy.next = ListNode(num%10)
            carry = num//10
            dummy = dummy.next
            l1 = l1.next
            l2 = l2.next
        
        while l1:
            num = l1.val + carry
            dummy.next = ListNode(num%10)
            carry = num//10
            dummy = dummy.next
            l1 = l1.next
        
        while l2:
            num = l2.val + carry
            dummy.next = ListNode(num%10)
            carry = num//10
            dummy = dummy.next
            l2 = l2.next
        
        if carry > 0:
            dummy.next = ListNode(carry)
        return results.next

            
