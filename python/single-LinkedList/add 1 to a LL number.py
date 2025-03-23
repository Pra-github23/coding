'''

class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None
'''

class Solution:
    def addOne(self,head):
        #Returns new head of linked List.
        
        revv = self.reverse(head)
        rev = revv
        carry  = 1
        
        while rev.next :
            num = (rev.data+carry)//10
            rev.data = (rev.data+carry)%10
            carry = num
            rev = rev.next
        
        if carry > 0:
            num = (rev.data+carry)//10
            rev.data = (rev.data+carry)%10
            if num > 0:
                rev.next = Node(num)
        
        return self.reverse(revv)
        
        
    
    def reverse(self, root):
        
        prev = None
        
        while root is not None:
            temp = root.next
            root.next = prev
            prev = root
            root = temp
        
        return prev
